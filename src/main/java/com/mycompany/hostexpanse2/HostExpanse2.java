/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hostexpanse2;

import com.mycompany.hostexpanse2.gui.MenuPrincipal;
import com.mycompany.hostexpanse2.model.Usuario;

/**
 *
 * @author cristian
 */
public class HostExpanse2 {

    public static void main(String[] args) {
//        Bienvenido bienvenido = new Bienvenido();
//        bienvenido.setVisible(true);
//        bienvenido.setLocationRelativeTo(null);
        
        MenuPrincipal menu = new MenuPrincipal(new Usuario());
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
