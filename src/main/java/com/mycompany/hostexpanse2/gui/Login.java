/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostexpanse2.gui;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

/**
 *
 * @author cristian
 */
public class Login extends javax.swing.JFrame {

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
        jPanel2 = new javax.swing.JPanel();
        lblimagen = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblContrasena = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnRecuperarConstasena = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 250, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(181, 221, 212));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblimagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\Documents\\NetBeansProjects\\hostExpanse\\src\\main\\java\\imagenes\\summerSfondo220px.png")); // NOI18N
        jPanel2.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 180));

        btnVolver.setBackground(new java.awt.Color(181, 221, 212));
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\Documents\\NetBeansProjects\\hostExpanse\\src\\main\\java\\imagenes\\flechaAtras.png")); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setPreferredSize(new java.awt.Dimension(80, 72));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 24, 24));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 340));

        lblContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblContrasena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContrasena.setText("Contraseña");
        jPanel1.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 120, 20));

        lblTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Inicio de Sesión");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 120, 20));

        lblUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 120, 20));

        txtUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 100, -1));

        btnRecuperarConstasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnRecuperarConstasena.setText("Recuperar Contraseña");
        jPanel1.add(btnRecuperarConstasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        btnIngresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 100, -1));

        btnRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 240, 100, -1));

        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registro registro = new Registro();
        dispose();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // Obtiene la pestaña actual
        Bienvenido bienvenido = new Bienvenido();
        dispose();
        bienvenido.setVisible(true);
        bienvenido.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRecuperarConstasena;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    

}
