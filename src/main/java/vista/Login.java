/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.ConexionBD;

/**
 *
 * @author Hugo Martín Morales DAM2B
 */
public class Login extends javax.swing.JFrame {
    int xMouse, yMouse;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        barralogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        contra = new javax.swing.JTextField();
        reccontra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        acceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 110, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 100, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 300, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 300, 10));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(160, 30, 250));
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMousePressed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 300, 40));

        contra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contra.setForeground(new java.awt.Color(160, 30, 250));
        contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraMousePressed(evt);
            }
        });
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 300, 40));

        reccontra.setBackground(new java.awt.Color(160, 30, 250));
        reccontra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reccontra.setForeground(new java.awt.Color(255, 255, 255));
        reccontra.setText("Rec.Contra");
        reccontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reccontraActionPerformed(evt);
            }
        });
        jPanel1.add(reccontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 700, 130, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nombrejpg.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, -1));

        registro.setBackground(new java.awt.Color(160, 30, 250));
        registro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText("Registro");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 700, 120, 40));

        acceder.setBackground(new java.awt.Color(160, 30, 250));
        acceder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        acceder.setForeground(new java.awt.Color(255, 255, 255));
        acceder.setText("Acceder");
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });
        jPanel1.add(acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 610, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraloginMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraloginMousePressed

    private void barraloginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraloginMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_barraloginMouseDragged

    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed
        // TODO add your handling code here:
        if(nombre.getText().equals("email@dominio.es")){
            nombre.setText("");
        }
        
        if(String.valueOf(contra.getText()).isEmpty()){
            contra.setText("******");
        }
    }//GEN-LAST:event_nombreMousePressed

    private void contraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraMousePressed
        // TODO add your handling code here:
        if(String.valueOf(contra.getText()).equals("******")){
            contra.setText("");
        }
        
        if(nombre.getText().isEmpty()){
            nombre.setText("email@dominio.es");
        }
    }//GEN-LAST:event_contraMousePressed

    private void reccontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reccontraActionPerformed
        //acceder al recuperar contraseña
        dispose();
        Reccontra contraFrame = new Reccontra();
        contraFrame.setVisible(true);
    }//GEN-LAST:event_reccontraActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // TODO add your handling code here:
        dispose();
        //abre el nuevo JFrame de Registro
        Registro registroFrame = new Registro();
        registroFrame.setVisible(true);
    }//GEN-LAST:event_registroActionPerformed

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
        // TODO add your handling code here:
        String nombreUsuario = nombre.getText();
        String password = contra.getText();
    //acceder al inicio de la app
    if (ConexionBD.verificarCredenciales(nombreUsuario, password)) {
        dispose();
        Principal principalFrame = new Principal();
        principalFrame.setVisible(true);
    } else {
        //mensaje error
        JOptionPane.showMessageDialog(null, "Error al intentar iniciar sesión", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_accederActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialPalenightIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceder;
    private javax.swing.JPanel barralogin;
    private javax.swing.JTextField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton reccontra;
    private javax.swing.JButton registro;
    // End of variables declaration//GEN-END:variables
}
