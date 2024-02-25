/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import modelo.DAOFactory;
import modelo.UsuariosDAO;
import modelo.entidades.Usuarios;
import modelo.impl.MysqlDAOFactory;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B
 */
public class UsuariosControl {

    public static int REGISTRO_CORRECTO = 0;
    public static int ERROR_USUARIO_YA_EXISTE = 1;
    public static int ERROR_CONTRASEÑAS_NO_COINCIDEN = 2;

    /**
     * comprueba que existe el usuario con la contraseña indicada
     *
     * @param nombreUsuario nombre del usuario a comprobar
     * @param contra contraseña de ese usuario
     * @return true si existe
     */
    public boolean accederLogin(String nombreUsuario, String contra) {
        boolean retorno = false;
        DAOFactory factoria = new MysqlDAOFactory();
        UsuariosDAO daoUsuario = factoria.getUsuariosDAO();
        Usuarios unusuario = new Usuarios();
        //parametros
        unusuario.setNombre_trabajador(nombreUsuario);
        unusuario.setContraseña(contra);

        unusuario = daoUsuario.obtenerUsuario(unusuario);

        //comprobar si existe
        if (unusuario != null) {
            retorno = true;
        }

        return retorno;
    }

    /**
     * registrar un nuevo usuario
     *
     * @param nombreUsuario nombre del usuario
     * @param contra1 contraseña del usuario
     * @param contra2 repetir contraseña
     * @param email email del usuario
     * @return Errorres o registro correcto
     */
    public int registrarUsuario(String nombreUsuario, String contra1, String contra2, String email) {
        int retorno = REGISTRO_CORRECTO;
        DAOFactory factoria = new MysqlDAOFactory();
        UsuariosDAO daoUsuario = factoria.getUsuariosDAO();
        Usuarios unusuario = new Usuarios();

        unusuario.setNombre_trabajador(nombreUsuario);
        unusuario.setContraseña(contra1);
        unusuario.setEmail_trabajador(email);
        unusuario.setRol("Veterinario");
        //comprobar contraseñas
        if (contra1.equals(contra2)) {
            //comprobar si existe
            if (daoUsuario.existeUsuario(unusuario) != null) {
                retorno = ERROR_USUARIO_YA_EXISTE;
            } else {
                daoUsuario.insertarUsuario(unusuario);
            }
        } else {
            retorno = ERROR_CONTRASEÑAS_NO_COINCIDEN;
        }

        return retorno;
    }
    /**
     * para enviar un correo al usuario con la nueva contraseña
     * @param correo 
     */
    public void enviarNuevaContraseña(String correo) {
        // TODO add your handling code here:
        //contraseña aleatoria de 4 cifras
        int min = 1000;
        int max = 9999;
        String contraseña = "" + ((int)(Math.random() * (max - min + 1) + min));
        final String fromEmail = "hugomartinmorales729@gmail.com";
        final String password = "losqrgkgsmxgfgqf";
        final String toEmail = correo;

        System.out.println("SSLEmail Start");
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.user", fromEmail);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        //saltarse la validación del certificado SSL
        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[]{new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }}, new java.security.SecureRandom());
            props.put("mail.smtp.ssl.socketFactory", sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        //llamada del metodo para cambiar contraseña en la BBDD
        DAOFactory factoria = new MysqlDAOFactory();
        UsuariosDAO daoUsuario = factoria.getUsuariosDAO();
        Usuarios unusuario = new Usuarios();

        unusuario.setContraseña(contraseña);
        unusuario.setEmail_trabajador(correo);
        daoUsuario.modificarContraseña(unusuario);

        Session session = Session.getDefaultInstance(props, auth);
        System.out.println("Session created");
        sendEmail(session, toEmail, "Recuperacion contraseña VetMartin", "Tu nueva contraseña es la siguiente: " + contraseña);

    }
    
    /**
     * segunda parte para enviar el email
     * @param session sesion
     * @param toEmail email al que enviar
     * @param subject
     * @param body cuerpo utf-8
     */
    private void sendEmail(Session session, String toEmail, String subject, String body) {
        try {

            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress("hugomartinmorales729@gmail.com", "VetMartín"));
            msg.setReplyTo(InternetAddress.parse("hugomartinmorales729@gmail.com", false));
            msg.setSubject(body, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            System.out.println("Message is ready");
            Transport.send(msg);
            System.out.println("EMail Sent Succesfully!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
