/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Date;
/*import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;*/
/**
 *
 * @author Hugo Martín Morales DAM2B
 */
public class EmailUtil {
    //TENGO PROBLEMAS CON LOS IMPORTS Y CON HIBERNATE ASI QUE HE DAJDO PUESTO LOS CODIGO PERO LA CONEXION NO ME VA 
    /*public static void sendEmail(Session session, String toEmail, String subject, String body, String fromEmail, String password) {
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress(fromEmail, "NoReply-JD"));
            msg.setReplyTo(InternetAddress.parse(fromEmail, false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));

            System.out.println("Mensaje listo");
            Transport.send(msg);
            System.out.println("Email enviado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}