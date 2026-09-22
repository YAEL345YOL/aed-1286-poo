package poo_u2_trabajos;

import javax.swing.JOptionPane;
import java.util.*;

public class HojaDePago {
    private String fechaInicio;
    private String fechaFin;
    private String trabajador;
    private Tarea chambas[];
    private double total;
    private int cima;
    
    HojaDePago(){
        chambas = new Tarea[20];
        cima = 0;
    }

    public HojaDePago(String fechaInicio, String fechaFin, String trabajador) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.trabajador = trabajador;
    }
    
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
        double maxCosto = chambas[0].getCosto();
        String nombreMaxCosto = chambas[0].getActividad();
        
        for(int i = 0; i < cima; ++i){
            if(maxCosto > chambas[i].getCosto()){
                maxCosto = chambas[i].getCosto();
                nombreMaxCosto = chambas[i].getActividad();
            }
        }
        
        return nombreMaxCosto;
    }
    
    public String actividadMasBarata(){
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
        return totalDePago() / (double) cima;
    }
    
    public String ticket(){
        String aux = "";
        for(int i = 0; i < cima; ++i)
            aux += chambas[i].toString() + "-----------------\n";
        return aux;
    }
}
