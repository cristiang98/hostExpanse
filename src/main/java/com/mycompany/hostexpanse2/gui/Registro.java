/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostexpanse2.gui;

/**
 *
 * @author cristian
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form registro
     */
    public Registro() {
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
        jLabel2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasena = new javax.swing.JLabel();
        lblConfirmarContrasena = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtRespuesta = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        txtConfirmarContrasena = new javax.swing.JTextField();
        txtPregunta = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnRecuperar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        btnVolver2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 250, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(254, 250, 247));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registro de Usuarios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 170, -1));

        lblNombre.setBackground(new java.awt.Color(254, 250, 247));
        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("*Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        lblApellido.setBackground(new java.awt.Color(254, 250, 247));
        lblApellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(0, 0, 0));
        lblApellido.setText("*Apellido:");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        lblCedula.setBackground(new java.awt.Color(254, 250, 247));
        lblCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(0, 0, 0));
        lblCedula.setText("*Cedúla:");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblDireccion.setBackground(new java.awt.Color(254, 250, 247));
        lblDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("*Dirección:");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblCorreo.setBackground(new java.awt.Color(254, 250, 247));
        lblCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("*Correo:");
        jPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblUsuario.setBackground(new java.awt.Color(254, 250, 247));
        lblUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("*Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        lblContrasena.setBackground(new java.awt.Color(254, 250, 247));
        lblContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblContrasena.setText("*Contraseña:");
        jPanel1.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        lblConfirmarContrasena.setBackground(new java.awt.Color(254, 250, 247));
        lblConfirmarContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblConfirmarContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblConfirmarContrasena.setText("*Confirmar contraseña:");
        jPanel1.add(lblConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        lblPregunta.setBackground(new java.awt.Color(254, 250, 247));
        lblPregunta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(0, 0, 0));
        lblPregunta.setText("*Pregunta secreta:");
        jPanel1.add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        lblRespuesta.setBackground(new java.awt.Color(254, 250, 247));
        lblRespuesta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblRespuesta.setForeground(new java.awt.Color(0, 0, 0));
        lblRespuesta.setText("*Respuesta secreta:");
        jPanel1.add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        txtNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNombre.setActionCommand("<Not Set>");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        txtApellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));

        txtCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));

        txtCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, -1));

        txtRespuesta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 150, -1));

        txtUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtUsuario.setToolTipText("");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 150, -1));

        txtContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 150, -1));

        txtConfirmarContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtConfirmarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 150, -1));

        txtPregunta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreguntaActionPerformed(evt);
            }
        });
        jPanel1.add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 150, -1));

        btnCrear.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 100, -1));

        btnRecuperar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnRecuperar.setText("Recuperar");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 100, -1));

        btnEditar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 100, -1));

        btnBorrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 100, -1));

        txtDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, -1));

        btnVolver2.setBackground(new java.awt.Color(254, 250, 247));
        btnVolver2.setIcon(new javax.swing.ImageIcon("D:\\proyectosNetbeans\\hostExpanse2\\src\\main\\java\\imagenes\\flechaAtras.png")); // NOI18N
        btnVolver2.setBorder(null);
        btnVolver2.setBorderPainted(false);
        btnVolver2.setPreferredSize(new java.awt.Dimension(80, 72));
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtConfirmarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarContrasenaActionPerformed

    private void txtPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreguntaActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        // Obtiene la pestaña actual
        Login login = new Login();
        dispose();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolver2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblConfirmarContrasena;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtConfirmarContrasena;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPregunta;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
