package poo_u2_chicoresponsable;
import java.util.*;
import javax.swing.*;

public class ChicoResponsable {
    public static void main(String[] args) {  
        /*String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante: ");
        String curp = JOptionPane.showInputDialog("Ingresa el CURP del estudiante: ");
        String telefono = JOptionPane.showInputDialog("Ingresa el numero de telefono: ");
        
        Chico chr = new Chico(nombre, curp, telefono);
        
        JOptionPane.showMessageDialog(null,
            "Nombre: " + chr.getNombre() + '\n' +
            "CURP: " + chr.getCurp()     + '\n' +
            "Telefono: " + chr.getTelefono()
        );
        
        int cantidad_conceptos = 0;
        
        do cantidad_conceptos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de conceptos: "));
        while(cantidad_conceptos <= 0);
        
        for(int i = 0; i < cantidad_conceptos; ++i){
            String concepto = JOptionPane.showInputDialog("Ingresa el concepto " + (i+1) + ": ");
            double gasto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el gasto " + (i+1) + ": "));   
            chr.setConcepto(concepto, gasto);
        }
        
        JOptionPane.showMessageDialog(null,
            "El promedio es: " + chr.promedio()              + '\n' +
            "El concepto mas alto es: " + chr.conceptoAlto() + '\n' +
            "El concepto mas bajo es: " + chr.conceptoBajo()
        );
        
        char flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres buscar conceptos? (Y / N): ").charAt(0));
        
        while(flag == 'Y'){
            String nombre_concepto = JOptionPane.showInputDialog("Ingrese el nombre el concepto: ");
            double gasto = chr.getMonto(nombre_concepto);
            
            if(gasto != -1) JOptionPane.showMessageDialog(null,
                "Concepto: " + nombre_concepto + '\n' +
                "Gasto:" + gasto
            );
            else JOptionPane.showMessageDialog(null, "[!] No se encontro el concepto llamado " + nombre_concepto);
            
            flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres ver otro concepto? (Y / N): ").charAt(0));
        }*/
        
        Chico chr = new Chico("Jessica", "ROGE06091NMN", "345345");
        
        chr.setConcepto("antro", 500);
        chr.setConcepto("gym", 350);
        chr.setConcepto("fraternidad", 200);
        chr.setConcepto("ingles", 501);
        chr.setConcepto("botana", 350);
        chr.setConcepto("vicio", 199);
        
        double consulta = chr.getMonto("gym");
        
        JOptionPane.showMessageDialog(null, "Valor del concepto: " + consulta);
    }
}
