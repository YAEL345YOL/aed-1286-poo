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
        
        
        // Calcular y mostrar en pantalla el promediode todos
        
        // Cuantos son exelentes
        // Cuantos son suficientes
        // Nombre del que tiene la mejor calificacion 
        
        int exelentes = 0, suficientes = 0, mejorCalif = 0;
        
        
    }
}
