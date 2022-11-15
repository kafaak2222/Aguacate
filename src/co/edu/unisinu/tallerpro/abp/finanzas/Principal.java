/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unisinu.tallerpro.abp.finanzas;

import aguacate.modelo.Usuario;
import aguacate.vista.venPrincipal;
import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        venPrincipal inicio = new venPrincipal();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        
    }
    public static List<Usuario> usuarios= new ArrayList();
}
