package com.mycompany.principal;

import java.util.*;
import javax.swing.JOptionPane;

public class POO_U2_Familia {
    public static void main(String args[]){
        Familia g = new Familia();
        Persona p1 = new Persona("Carlos López", "LOCA850312XYZ", "carlos.l@email.com", "5512345678", 1500.00);
        Persona p2 = new Persona("María García", "GARM921024ABC", "m.garcia@email.com", "8123456789", 2300.50);
        Persona p3 = new Persona("José Hernández", "HEGJ780505DEF", "jose.h@email.com", "3311223344", 850.75);
        
        g.addPersona(p1);
        g.addPersona(p2);
        g.addPersona(p3);
        
        JOptionPane.showMessageDialog(null, 
            g.getPromedio()   + '\n' +
            g.getMayorGasto() + '\n' +
            g.getMenorGasto()
        );
        
        char flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres buscar una persona? (Y / N): ").charAt(0));
        
        while(flag == 'Y'){
            String nombre = JOptionPane.showInputDialog("Ingresa nombre de la persona: ");
            
            Persona a = g.getDatos(nombre);
            
            if(a != null)
                a.presentarse();
            else
                JOptionPane.showMessageDialog(null, "No se encontro la persona con nombre" + nombre);
            
            flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres buscar otra persona? (Y / N): ").charAt(0));
        }
    }
}
