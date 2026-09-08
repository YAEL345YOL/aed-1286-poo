package poo_u2_bachiller;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Bachiller b1 = new Bachiller();
        Bachiller b2 = new Bachiller();
        Bachiller b3 = new Bachiller();
        Bachiller b4 = new Bachiller();
        
        b1.setNombre("Sonia Moreno");
        b1.setCarrera("Fisico matematico");
        b1.setCalif(9.5);
        b1.calcCualificacion();
        
        b2.setNombre("Kenia Oz");
        b2.setCarrera("Musica");
        b2.setCalif(6.5);
        b2.calcCualificacion();
        
        b3.setNombre("Axel Garcia");
        b3.setCarrera("Gym");
        b3.setCalif(5.7);
        b3.calcCualificacion();
        
        b4.setNombre("Leonel Messi");
        b4.setCarrera("Farmacobiologo");
        b4.setCalif(9.6);
        b4.calcCualificacion();
        
        // Suma
        
        double suma = 0; 
        
        suma += b1.getCalif();
        suma += b2.getCalif();
        suma += b3.getCalif();
        suma += b4.getCalif();
        
        // Obtencion de la cantidad de exelentes, buenos, suficientes y insuficientes
        
        int insuficiente = 0, suficiente = 0, bueno = 0, exelente = 0;
                
        if(b1.getCualificacion().equals("Exelente")) exelente += 1;
        else if(b1.getCualificacion().equals("Bueno")) bueno += 1;
        else if(b1.getCualificacion().equals("Suficiente")) suficiente += 1;
        else insuficiente += 1;
        
        if(b2.getCualificacion().equals("Exelente")) exelente += 1;
        else if(b2.getCualificacion().equals("Bueno")) bueno += 1;
        else if(b2.getCualificacion().equals("Suficiente")) suficiente += 1;
        else insuficiente += 1;
        
        if(b3.getCualificacion().equals("Exelente")) exelente += 1;
        else if(b3.getCualificacion().equals("Bueno")) bueno += 1;
        else if(b3.getCualificacion().equals("Suficiente")) suficiente += 1;
        else insuficiente += 1;
        
        if(b4.getCualificacion().equals("Exelente")) exelente += 1;
        else if(b4.getCualificacion().equals("Bueno")) bueno += 1;
        else if(b4.getCualificacion().equals("Suficiente")) suficiente += 1;
        else insuficiente += 1;
        
        // Nombre de la persona con mayor promedio
        
        double mayorCalif = b1.getCalif();
        String nombreMayorCalif = b1.getNombre();
        
        if(b2.getCalif() > mayorCalif){
            mayorCalif = b2.getCalif();
            nombreMayorCalif = b2.getNombre();
        }
        
        if(b3.getCalif() > mayorCalif){
            mayorCalif = b3.getCalif();
            nombreMayorCalif = b3.getNombre();
        }
        
        if(b4.getCalif() > mayorCalif){
            mayorCalif = b4.getCalif();
            nombreMayorCalif = b4.getNombre();
        }
        
        // Resultados

        System.out.println("Exelentes: " + exelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Suficientes: " + suficiente);
        System.out.println("Insuficientes: " + insuficiente);
        System.out.println("Promedio: " + (suma / 4.0));
        System.out.println("Persona mayor promedio: " + nombreMayorCalif);
    }
}
