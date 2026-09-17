package poo_u2_chicoresponsable;
import java.util.*;
import javax.swing.*;

public class ChicoResponsable {
    public static void main(String[] args) {  
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante: ");
        String curp = JOptionPane.showInputDialog("Ingresa el CURP del estudiante: ");
        String telefono = JOptionPane.showInputDialog("Ingresa el numero de telefono: ");
        
        Chico chr = new Chico(nombre, curp, telefono);
        
        int cantidad_conceptos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de conceptos: "));
        
        for(int i = 0; i < cantidad_conceptos; ++i){
            String concepto = JOptionPane.showInputDialog("Ingresa el concepto " + (i+1) + ": ");
            double gasto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el gasto " + (i+1) + ": "));
            
            chr.setConcepto(concepto, gasto);
        }
        
        if(chr.promedio() != -1) JOptionPane.showMessageDialog(null, "El promedio es: " + chr.promedio());
        else JOptionPane.showMessageDialog(null, "No hay datos para calcular el promedio");
        
        if(chr.conceptoAlto() != null) JOptionPane.showMessageDialog(null, "El concepto mas alto es: " + chr.conceptoAlto());
        else JOptionPane.showMessageDialog(null, "No hay datos para calcular el concepto mas alto");
        
        if(chr.conceptoBajo() != null) JOptionPane.showMessageDialog(null, "El concepto mas bajo es: " + chr.conceptoBajo());
        else JOptionPane.showMessageDialog(null, "No hay datos para calcular el concepto mas bajo");
        
    }
}
