package poo_u2_chicoresponsable;
import java.util.*;
import javax.swing.JOptionPane;

public class ChicoResponsable {
    public static void main(String[] args) {
        Chico chr = new Chico();
        Chico chr2 = new Chico("Jessica", "ROGE06914MMN", "345345");
        
        chr2.setConcepto("antro", 500);
        chr2.setConcepto("gym", 350);
        chr2.setConcepto("romance", 200);
        
        JOptionPane.showMessageDialog(null, "El promedio es " + chr2.promedio());
        JOptionPane.showMessageDialog(null, "El concepto mas alto es " + chr2.conceptoAlto());
        JOptionPane.showMessageDialog(null, "El concepto mas bajo es " + chr2.conceptoBajo());
    }
}
