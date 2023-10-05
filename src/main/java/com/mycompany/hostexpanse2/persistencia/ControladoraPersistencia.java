/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hostexpanse2.persistencia;

import com.mycompany.hostexpanse2.model.Usuario;
import com.mycompany.hostexpanse2.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Drow
 */
public class ControladoraPersistencia {
    
    UsuarioJpaController userJpa = new UsuarioJpaController();

    public void agregar(Usuario user) {
        userJpa.create(user);
    }

    public void eliminarByCedula(int cedula) throws NonexistentEntityException {
        userJpa.destroy(userJpa.encontrarIdByCedula(cedula));
    }
    
    public void editar(Usuario usuario) throws Exception{
        userJpa.edit(usuario);
    }

    public void editarByCedula(int cedula) {
        int usuarioId = userJpa.encontrarIdByCedula(cedula);
        Usuario user = userJpa.findUsuario(usuarioId);
    }

    public int encontrarIdByCedula(int cedula) {
        int userId = userJpa.encontrarIdByCedula(cedula);
        return userId;
    }
    
    public Usuario encontrarUserById(int userId){
        Usuario userObj = userJpa.findUsuario(userId);
        return userObj;
    }
    
}
