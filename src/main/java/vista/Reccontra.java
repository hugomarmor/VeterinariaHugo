/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import controlador.UsuariosControl;
import javax.swing.JOptionPane;

/**
 *
 * @author HUGO MARTÍN MORALES DAM2B DAM2B
 */
public class Reccontra extends javax.swing.JFrame {
    int xMouse, yMouse;
    private UsuariosControl controlador;

    /**
     * Creates new form Reccontra
     */
    public Reccontra() {
        initComponents();
        //al pulsar "enter"
        getRootPane().setDefaultButton(mancorreo);
        controlador = new UsuariosControl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mancorreo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        barralogin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperar contraseña");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nombrejpg.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, -1));

        mancorreo.setBackground(new java.awt.Color(160, 30, 250));
        mancorreo.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        mancorreo.setForeground(new java.awt.Color(255, 255, 255));
        mancorreo.setText("Correo");
        mancorreo.setToolTipText("Para enviarte una nueva contraseña");
        mancorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mancorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mancorreoActionPerformed(evt);
            }
        });
        jPanel1.add(mancorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 480, 120, 40));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Correo (Rec.Contra)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 180, 30));

        correo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(160, 30, 250));
        correo.setToolTipText("Tu correo para iniciar sesion");
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoMousePressed(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 300, 40));

        login.setBackground(new java.awt.Color(160, 30, 250));
        login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setToolTipText("Para volver al Login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 700, 120, 40));

        barralogin.setBackground(new java.awt.Color(255, 255, 255));
        barralogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraloginMouseDragged(evt);
            }
        });
        barralogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraloginMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraloginLayout = new javax.swing.GroupLayout(barralogin);
        barralogin.setLayout(barraloginLayout);
        barraloginLayout.setHorizontalGroup(
            barraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        barraloginLayout.setVerticalGroup(
            barraloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(barralogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mancorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mancorreoActionPerformed
        if (correo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduzca un correo valido");
        } else {
            controlador.enviarNuevaContraseña(correo.getText());
            JOptionPane.showMessageDialog(null, "Se ha cambiado correctamente la contraseña");
            dispose();
            Login loginFrame = new Login();
            loginFrame.setVisible(true);
        }
    }//GEN-LAST:event_mancorreoActionPerformed

    private void correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMousePressed
        // TODO add your handling code here:
        if (correo.getText().isEmpty()) {
            correo.setText("email@dominio.es");
        }
    }//GEN-LAST:event_correoMousePressed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        //cambiar al login
        dispose();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void barraloginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraloginMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_barraloginMouseDragged

    private void barraloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraloginMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraloginMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialPalenightIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reccontra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barralogin;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JButton mancorreo;
    // End of variables declaration//GEN-END:variables
}
