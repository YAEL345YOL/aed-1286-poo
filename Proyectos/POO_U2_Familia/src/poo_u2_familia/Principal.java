package poo_u2_familia;

import javax.swing.JOptionPane;
import java.util.*;


public class Principal {
    public static void main(String[] args) {
        Familia g = new Familia();
        
        Persona p1 = new Persona("Carlos Arturo", "LOCA850312XYZ", "carlos.l@email.com", "5512345678", 1500.00);
        Persona p2 = new Persona("Maria Garcia", "GARM921024ABC", "m.garcia@email.com", "8123456789", 2300.50);
        Persona p3 = new Persona("Jose Hernandez", "HEGJ780505DEF", "jose.h@email.com", "3311223344", 850.75);
        Persona p4 = new Persona("Maria Lopez", "LOMM850312ABC", "maria.l@email.com", "3334567890", 1250.50);
        Persona p5 = new Persona("Carlos Ramirez", "RACC900721XYZ", "carlos.r@email.com", "3345678901", 675.25);
        
        g.addPersona(p1);
        g.addPersona(p2);
        g.addPersona(p3);
        g.addPersona(p4);
        g.addPersona(p5);
        
        JOptionPane.showMessageDialog(null, 
            "Promedio gastos: " + g.getPromedio() + '\n' +
            "Mayor gasto: " + g.getMayorGasto()   + '\n' +
            "Menor gasto: " + g.getMenorGasto()  
        );
        
        JOptionPane.showMessageDialog(null, "Reporte\n" + g.getReporte());
        
        char flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres buscar una persona? (Y / N): ").charAt(0));
        
        while(flag == 'Y'){
            String nombre = JOptionPane.showInputDialog("Ingresa nombre de la persona: ");
            
            Persona a = g.getDatos(nombre);
            
            if(a != null)
                JOptionPane.showMessageDialog(null, 
                    "Nombre: " + a.getNombre() + '\n' +
                    "Gasto semanal: " + a.getGasto_semanal()
                );
            else
                JOptionPane.showMessageDialog(null, "[!] No se encontro la persona con nombre: " + nombre);
            
            flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres buscar otra persona? (Y / N): ").charAt(0));
        }
    }
    
}
