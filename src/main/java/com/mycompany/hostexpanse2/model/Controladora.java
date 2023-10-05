/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostexpanse2.model;

import com.mycompany.hostexpanse2.persistencia.ControladoraPersistencia;
import com.mycompany.hostexpanse2.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Drow
 */
public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();

    public void agregar(String nombre, String apellido, int cedula, String correo, String direccion, String usuario, String contrasena, String pregunta, String respuesta) {
        
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setCedula(cedula);
        user.setCorreo(correo);
        user.setDireccion(direccion);
        user.setUsuario(usuario);
        user.setContrasena(contrasena);
        user.setPregunta(pregunta);
        user.setRespuesta(respuesta);
        
        
        control.agregar(user);
    }
    
    public void editar(Usuario usuario) throws Exception{
        control.editar(usuario);
    }
    
    public int encontrarIdByCedula(int cedula){
        return control.encontrarIdByCedula(cedula);
    }

    public void borrarByCedula(int cedula) throws NonexistentEntityException {
        control.eliminarByCedula(cedula);
    }

    public void editarByCedula(int cedula) {
        control.editarByCedula(cedula);
    }
    
    public Usuario encontrarUserById(int userId){
        return control.encontrarUserById(userId);
    }
    
}
