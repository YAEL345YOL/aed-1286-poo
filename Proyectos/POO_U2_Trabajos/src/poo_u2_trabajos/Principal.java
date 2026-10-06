package poo_u2_trabajos;

import java.util.*;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {   
        HojaDePago hoja = new HojaDePago(
            "01/10/2026",
            "05/10/2026",
            "Yael Gómez"
        );

        Tarea t1 = new Tarea();
        t1.setActividad("carpinteria");
        t1.setCosto(400.00);
        t1.setDescripcion("Manejo de madera");
        t1.setUnidadMedidad("m2");

        Tarea t2 = new Tarea();
        t2.setActividad("limpieza");
        t2.setCosto(420.00);
        t2.setDescripcion("Limpieza general");
        t2.setUnidadMedidad("hora");

        Tarea t3 = new Tarea();
        t3.setActividad("jardineria");
        t3.setCosto(650.00);
        t3.setDescripcion("Mantenimiento de jardin");
        t3.setUnidadMedidad("hora");

        Tarea t4 = new Tarea();
        t4.setActividad("pintura");
        t4.setCosto(1200.00);
        t4.setDescripcion("Pintura de fachada");
        t4.setUnidadMedidad("m2");

        Tarea t5 = new Tarea();
        t5.setActividad("electricidad");
        t5.setCosto(950.00);
        t5.setDescripcion("Instalacion de contactos");
        t5.setUnidadMedidad("pieza");
        
        hoja.addTarea(t1);
        hoja.addTarea(t2);
        hoja.addTarea(t3);
        hoja.addTarea(t4);
        hoja.addTarea(t5);
                
        System.out.println(hoja.ticket());
        
        //////// MENU DE BUSQUEDA ////////
        
        char flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres buscar una actividad? (Y / N): ").charAt(0));
        
        while(flag == 'Y'){
            String nombre = JOptionPane.showInputDialog("Ingresa nombre de la actividad: ");
           
            JOptionPane.showMessageDialog(null, "Total: " + hoja.totalPagoPorActividad(nombre) + '\n');
            
            flag = Character.toUpperCase(JOptionPane.showInputDialog("¿Quieres buscar otra actividad? (Y / N): ").charAt(0));
        }
        
        //////// DESCARGAR TICKET ////////
        
        try {
            Path ruta = Path.of(
            System.getProperty("user.home"),
            "Downloads",
            "ticket" + hoja.getTrabajador() + ".txt"
            );

            Files.writeString(
                ruta,
                hoja.ticket(),
                StandardCharsets.UTF_8
            );

            System.out.println("Ticket guardado en: " + ruta);

        } catch (IOException e) {
            System.out.println("Error al guardar el ticket.");
        }
    }
}
