/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostexpanse2.gui;

import com.mycompany.hostexpanse2.model.Habitacion;
import com.mycompany.hostexpanse2.model.Reserva;
import com.mycompany.hostexpanse2.model.Usuario;
import com.mycompany.hostexpanse2.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Drow
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
    List<String> roomListNumero = new ArrayList<>();

   
    public MenuPrincipal(Usuario usuario) {
        initComponents();
        panelReservas.setVisible(true);
        panelAdmin.setVisible(false);
        panelEstados.setVisible(false);
        if (usuario.getPermisos() == 0){
            btnAdmin.setEnabled(false);
            panelAdmin.setVisible(false);
        }
        construirTabla();
        llenarDatos();
        comboHabitaciones.setModel(comboModel);
        comboHabitaciones();
    }
    
    public void comboHabitaciones(){
        comboModel.removeAllElements();
        roomListNumero.clear();
        for (Habitacion habitacion : listHabitacionesNumero()){
            if (habitacion.getIsDisponible() == true){
                roomListNumero.add(habitacion.getNumeroPiso());
            }
        }
        
        comboModel.addAll(roomListNumero);
        comboHabitaciones.repaint();
    }
    
    public void construirTabla(){
        tableModel.addColumn("Número de habitación");
        tableModel.addColumn("Cantidad de camas");
        tableModel.addColumn("Disponible");
        tableModel.addColumn("Vista al mar");
        this.tblRooms.setModel(tableModel);
    }
    
    public void llenarDatos(){
        List<Habitacion> habitaciones = controladoraPersistencia.encontrarHabitaciones();
        
        for (Habitacion habitacion : habitaciones){
            String dispo = habitacion.getIsDisponible() ? "Si" : "No";
            String vista = habitacion.getVistaAlMar() ? "Si" : "No";
            Object[] rowData = {habitacion.getNumeroPiso(), habitacion.getCantidadCamas(), dispo,  vista};
            tableModel.addRow(rowData);
        }
    }
    
    public List<Habitacion> listHabitacionesNumero(){
        List<Habitacion> list = new ArrayList<>();
        for (Habitacion habitacion : controladoraPersistencia.encontrarHabitaciones()){
            list.add(habitacion);
        }
        return list;
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
        btnReservas = new javax.swing.JButton();
        btnEstadoHabitaciones = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelReservas = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        lblHabitacion = new javax.swing.JLabel();
        txtNoches = new javax.swing.JTextField();
        lblNoches = new javax.swing.JLabel();
        lblPrecioNoche = new javax.swing.JLabel();
        lblNumeroPersonas = new javax.swing.JLabel();
        txtNumeroPersonas = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        comboHabitaciones = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtPrecioNoche = new javax.swing.JTextField();
        panelEstados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRooms = new javax.swing.JTable();
        panelAdmin = new javax.swing.JPanel();
        lblHabitaciones = new javax.swing.JLabel();
        btnCrearHabitacion = new javax.swing.JButton();
        btnEditarHabitacion = new javax.swing.JButton();
        btnBorrarHabitacion = new javax.swing.JButton();
        lblPerfiles = new javax.swing.JLabel();
        btnRecuperarPerfil = new javax.swing.JButton();
        btnEditarPerfil = new javax.swing.JButton();
        btnBorrarPerfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(181, 221, 212));

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));

        btnReservas.setBackground(new java.awt.Color(254, 250, 247));
        btnReservas.setText("Reservas");
        btnReservas.setBorder(null);
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        btnEstadoHabitaciones.setBackground(new java.awt.Color(254, 250, 247));
        btnEstadoHabitaciones.setText("Estado de las habitaciones");
        btnEstadoHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoHabitacionesActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(254, 250, 247));
        btnAdmin.setText("Panel de administrador");
        btnAdmin.setBorder(null);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEstadoHabitaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReservas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEstadoHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 570));

        jPanel2.setBackground(new java.awt.Color(254, 250, 247));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelReservas.setBackground(new java.awt.Color(254, 250, 247));

        lblNombre.setBackground(new java.awt.Color(254, 250, 247));
        lblNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNombre.setText("*Nombre:");

        txtNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setActionCommand("<Not Set>");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCedula.setBackground(new java.awt.Color(254, 250, 247));
        lblCedula.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblCedula.setText("*Cedúla:");

        lblHabitacion.setBackground(new java.awt.Color(254, 250, 247));
        lblHabitacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblHabitacion.setText("*Habitación:");

        txtNoches.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNoches.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNoches.setBackground(new java.awt.Color(254, 250, 247));
        lblNoches.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNoches.setText("*Noches:");

        lblPrecioNoche.setBackground(new java.awt.Color(254, 250, 247));
        lblPrecioNoche.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblPrecioNoche.setText("*Precio cada noche:");

        lblNumeroPersonas.setBackground(new java.awt.Color(254, 250, 247));
        lblNumeroPersonas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblNumeroPersonas.setText("*Numero de personas:");

        txtNumeroPersonas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNumeroPersonas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtApellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblApellido.setBackground(new java.awt.Color(254, 250, 247));
        lblApellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblApellido.setText("*Apellido:");

        lblContacto.setBackground(new java.awt.Color(254, 250, 247));
        lblContacto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblContacto.setText("*Contacto:");

        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(254, 250, 247));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reserva de habitaciones");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReservasLayout = new javax.swing.GroupLayout(panelReservas);
        panelReservas.setLayout(panelReservasLayout);
        panelReservasLayout.setHorizontalGroup(
            panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReservasLayout.createSequentialGroup()
                .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelReservasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelReservasLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblNoches)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(txtNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContacto)
                    .addComponent(lblPrecioNoche)
                    .addComponent(lblApellido)
                    .addComponent(lblNumeroPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtTelefono)
                    .addComponent(txtPrecioNoche))
                .addGap(23, 23, 23))
            .addGroup(panelReservasLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelReservasLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelReservasLayout.createSequentialGroup()
                            .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelReservasLayout.createSequentialGroup()
                                    .addComponent(lblCedula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelReservasLayout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelReservasLayout.createSequentialGroup()
                                    .addGap(196, 196, 196)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReservasLayout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(txtNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(lblHabitacion))
                    .addContainerGap(22, Short.MAX_VALUE)))
        );
        panelReservasLayout.setVerticalGroup(
            panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReservasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(147, 147, 147)
                .addComponent(lblApellido)
                .addGap(26, 26, 26)
                .addComponent(lblNumeroPersonas)
                .addGap(21, 21, 21)
                .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrecioNoche)
                        .addComponent(txtPrecioNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContacto)
                    .addComponent(txtNoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoches)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelReservasLayout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReservasLayout.createSequentialGroup()
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58))
                        .addGroup(panelReservasLayout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addGroup(panelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCedula)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)))
                    .addComponent(lblHabitacion)
                    .addContainerGap(242, Short.MAX_VALUE)))
        );

        jPanel2.add(panelReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 530));

        panelEstados.setBackground(new java.awt.Color(254, 250, 247));

        tblRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRooms);

        javax.swing.GroupLayout panelEstadosLayout = new javax.swing.GroupLayout(panelEstados);
        panelEstados.setLayout(panelEstadosLayout);
        panelEstadosLayout.setHorizontalGroup(
            panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panelEstadosLayout.setVerticalGroup(
            panelEstadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jPanel2.add(panelEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 530));

        panelAdmin.setBackground(new java.awt.Color(254, 250, 247));

        lblHabitaciones.setText("Gestionar habitaciones");

        btnCrearHabitacion.setText("Crear habitación");
        btnCrearHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearHabitacionActionPerformed(evt);
            }
        });

        btnEditarHabitacion.setText("Modificar habitación");
        btnEditarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHabitacionActionPerformed(evt);
            }
        });

        btnBorrarHabitacion.setText("Eliminar habitación");
        btnBorrarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarHabitacionActionPerformed(evt);
            }
        });

        lblPerfiles.setText("Gestionar perfiles");

        btnRecuperarPerfil.setText("Recuperar perfil");

        btnEditarPerfil.setText("Modificar perfil");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });

        btnBorrarPerfil.setText("Eliminar perfil");
        btnBorrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdminLayout = new javax.swing.GroupLayout(panelAdmin);
        panelAdmin.setLayout(panelAdminLayout);
        panelAdminLayout.setHorizontalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminLayout.createSequentialGroup()
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRecuperarPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminLayout.createSequentialGroup()
                        .addComponent(lblPerfiles)
                        .addGap(25, 25, 25)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        panelAdminLayout.setVerticalGroup(
            panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminLayout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(panelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(lblHabitaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdminLayout.createSequentialGroup()
                        .addComponent(lblPerfiles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecuperarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(173, 173, 173))
        );

        jPanel2.add(panelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 530));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 670, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        panelReservas.setVisible(true);
        panelAdmin.setVisible(false);
        panelEstados.setVisible(false);
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnEstadoHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoHabitacionesActionPerformed

        panelReservas.setVisible(false);
        panelAdmin.setVisible(false);
        panelEstados.setVisible(true);
    }//GEN-LAST:event_btnEstadoHabitacionesActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed

        panelReservas.setVisible(false);
        panelAdmin.setVisible(true);
        panelEstados.setVisible(false);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        EditarUsuario editarUsuario = new EditarUsuario();
        editarUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editarUsuario.setVisible(true);
        editarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnBorrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPerfilActionPerformed
        BorrarUsuario borrarUsuario = new BorrarUsuario();
        borrarUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        borrarUsuario.setVisible(true);
        borrarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBorrarPerfilActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCrearHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearHabitacionActionPerformed
        CrearHabitacion crearHabitacion = new CrearHabitacion();
        crearHabitacion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        crearHabitacion.setVisible(true);
        crearHabitacion.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearHabitacionActionPerformed

    private void btnBorrarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarHabitacionActionPerformed
        BorrarUsuario borrarUsuario = new BorrarUsuario("Eliminar habitacion", "Numero de la habitacion");
        borrarUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        borrarUsuario.setVisible(true);
        borrarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBorrarHabitacionActionPerformed

    private void btnEditarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarHabitacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reserva reserva = new Reserva();
        Habitacion habitacion;
        try {
            reserva.setNombreHuesped(txtNombre.getText());
            reserva.setApellidoHuesped(txtApellido.getText());
            reserva.setCedulaHuesped(txtCedula.getText());
            reserva.setNumeroPersonas(Integer.parseInt(txtNumeroPersonas.getText()));
            reserva.setNumeroHabitacion((String) comboHabitaciones.getSelectedItem());
            String num = (String)comboHabitaciones.getSelectedItem();
            reserva.setNoches(Integer.parseInt(txtNoches.getText()));
            reserva.setNumeroTelefono(txtTelefono.getText());
            reserva.setNochePrecio(Integer.parseInt(txtPrecioNoche.getText()));
            reserva.calcularReserva();
            reserva.calcularTotal();
            habitacion = controladoraPersistencia.findHabitacion(controladoraPersistencia.encontrarIdByNumeroPiso(num));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Por favor verifique los datos correctamente, recuerde\nno usar carácteres especiales.");
            return;
        }
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtNumeroPersonas.setText("");
        comboHabitaciones.setSelectedIndex(0);
        txtNoches.setText("");
        txtTelefono.setText("");
        txtPrecioNoche.setText("");
        controladoraPersistencia.agregarReserva(reserva);
        habitacion.switchDisponible();
        try {
            controladoraPersistencia.editarHabitacion(habitacion);
        } catch (Exception ex) {
            
        }
        tableModel = (DefaultTableModel) tblRooms.getModel();
        tableModel.setRowCount(0);
        llenarDatos();
        comboHabitaciones();
        
        JOptionPane.showMessageDialog(null, "Reserva guardada correctamente.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBorrarHabitacion;
    private javax.swing.JButton btnBorrarPerfil;
    private javax.swing.JButton btnCrearHabitacion;
    private javax.swing.JButton btnEditarHabitacion;
    private javax.swing.JButton btnEditarPerfil;
    private javax.swing.JButton btnEstadoHabitaciones;
    private javax.swing.JButton btnRecuperarPerfil;
    private javax.swing.JButton btnReservas;
    private javax.swing.JComboBox<String> comboHabitaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblHabitacion;
    private javax.swing.JLabel lblHabitaciones;
    private javax.swing.JLabel lblNoches;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroPersonas;
    private javax.swing.JLabel lblPerfiles;
    private javax.swing.JLabel lblPrecioNoche;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelEstados;
    private javax.swing.JPanel panelReservas;
    private javax.swing.JTable tblRooms;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNoches;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroPersonas;
    private javax.swing.JTextField txtPrecioNoche;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
