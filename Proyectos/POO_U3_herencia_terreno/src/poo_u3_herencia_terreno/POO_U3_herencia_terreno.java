package poo_u3_herencia_terreno;

import javax.swing.JOptionPane;

public class POO_U3_herencia_terreno {
    public static void main(String[] args) {
        Predio p1 = new Predio(20, 8, 1000, 2000);
        
        JOptionPane.showMessageDialog(null, p1.reporte());
    }
}
