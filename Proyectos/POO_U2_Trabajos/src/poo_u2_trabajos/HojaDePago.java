package poo_u2_trabajos;

import java.util.*;

public class HojaDePago {
    private String fechaInicio;
    private String fechaFin;
    private String trabajador;
    private Tarea chambas[];
    private double total;
    private int cima;
    private int largo = 50;
    
    HojaDePago(){
        chambas = new Tarea[20];
        cima = 0;
    }

    public HojaDePago(String fechaInicio, String fechaFin, String trabajador) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.trabajador = trabajador;
        chambas = new Tarea[20];
        cima = 0;
    }
    
    public String getTrabajador(){ return this.trabajador; }
    
    public void addTarea(Tarea tarea){
        chambas[cima] = tarea;
        ++cima;
    }
    
    public double totalPagoPorActividad(String tarea){
        double suma = 0;
        
        for(int i = 0; i < cima; ++i)
            if(chambas[i].getActividad().equals(tarea.toLowerCase()))
                suma += chambas[i].getCosto();
        
        return suma;
    }
    
    public String actividadMasCara(){
        if(cima == 0) return null;
        
        double maxCosto = chambas[0].getCosto();
        String nombreMaxCosto = chambas[0].getActividad();
        
        for(int i = 0; i < cima; ++i){
            if(maxCosto < chambas[i].getCosto()){
                maxCosto = chambas[i].getCosto();
                nombreMaxCosto = chambas[i].getActividad();
            }
        }
        
        return nombreMaxCosto;
    }
    
    public String actividadMasBarata(){
        if(cima == 0) return null;
        
        double minCosto = chambas[0].getCosto();
        String nombreMinCosto = chambas[0].getActividad();
        
        for(int i = 0; i < cima; ++i){
            if(minCosto > chambas[i].getCosto()){
                minCosto = chambas[i].getCosto();
                nombreMinCosto = chambas[i].getActividad();
            }
        }
        
        return nombreMinCosto;
    }
    
    public double totalDePago(){
        double suma = 0;
        for(int i = 0; i < cima; ++i)
            suma += chambas[i].getCosto();
        return suma;
    }
    
    public double promedioCosto(){
        if(cima == 0) return 0;
        return totalDePago() / (double) cima;
    }
    
    private String center(String cadena){
        int rest = (largo - cadena.length()) / 2;
        return " ".repeat(rest) + cadena + " ".repeat(largo - rest - cadena.length());
    }
    
    private String normal(String cadena){
        int rest = (this.largo - cadena.length());
        return "║ " + cadena + " ".repeat(rest - 1) + "║\n";
    }
    
    private String h1(String cadena){
        return "║" + center(cadena) + "║\n";
    }
    
    public String ticket(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "═".repeat(largo);
        
        aux.append("╔").append(separador).append("╗\n");
        
        aux.append(h1("HOJA DE PAGO"));
        aux.append(h1("SISTEMA DE TRABAJOS"));
        
        aux.append("╠").append(separador).append("╣\n");
        
        aux.append(normal("Trabajador: " + trabajador));
        aux.append(normal("Fecha inicio: " + fechaInicio));
        aux.append(normal("Fecha fin: " + fechaFin));
        
        aux.append("╠").append(separador).append("╣\n");
        
        int k = (largo - 27) / 2;
        
        aux.append("║ ACTIVIDAD" + " ".repeat(k) + "DESCRIPCIÓN" + " ".repeat(k - (largo & 1)) + " COSTO ║\n");
        
        aux.append("╠").append(separador).append("╣\n");
        
        for(int i = 0; i < cima; ++i){
            k = (largo - 23);
            aux.append(String.format(
                "║%-14s%-"+k+"s$%8.2f║%n",
                chambas[i].getActividad(),
                chambas[i].getDescripcion(),
                chambas[i].getCosto()
            ));
        }
        
        aux.append("╠").append(separador).append("╣\n");
        
        k = (largo - 13);
        
        aux.append(String.format(
            "║ %-"+k+"s $%9.2f ║%n",
            "TOTAL",
            totalDePago()
        ));
        
        aux.append(String.format(
            "║ %-"+k+"s $%9.2f ║%n",
            "PROMEDIO",
            promedioCosto()
        ));
        
        aux.append("╠").append(separador).append("╣\n");
        
        k = (largo - 23);
        
        aux.append(String.format(
            "║ %-" + k +"s %20s ║%n",
            "ACTIVIDAD MÁS CARA",
            actividadMasCara()
        ));

        aux.append(String.format(
            "║ %-" + k + "s %20s ║%n",
            "ACTIVIDAD MÁS BARATA",
            actividadMasBarata()
        ));
        
        aux.append("╠").append(separador).append("╣\n");
        
        aux.append(h1("GRACIAS POR SU PREFERENCIA"));
        
        aux.append("╚").append(separador).append("╝\n");
        
        return aux.toString();
    }
   
}
