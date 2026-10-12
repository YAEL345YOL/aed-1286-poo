package com.mycompany.poo_u2_p4;

import java.util.*;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class POO_U2_P4 {
    public static void main(String[] args) {
        Fiesta fiesta = new Fiesta(
            new Musica("Banda", true, "Banda en vivo para el evento", "Familiar"),
            new Banquete("Basico", "Pollo con guarnición y ensalada", 0, true),
            new Bebida("Refresco", "Refrescos para los invitados", 0),
            new Salon("Jardín Los Pinos", "Jardin", true, "Jardín amplio para eventos", 100), 
            new Mobiliario("Elegante", "Formal", "Mesas elegantes decoradas", 0),
            45
        );
        
        System.out.println(fiesta.informe());
        
        try {
            Path ruta = Path.of(
                System.getProperty("user.home"),
                "Downloads",
                "ticket_fiesta.txt"
            );

            Files.writeString(ruta, fiesta.informe());
            
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(ruta.toFile());
            }
            
        } catch (IOException e) {
            System.out.println("Error al generar o abrir el ticket: " + e.getMessage());
        }
    }
}
