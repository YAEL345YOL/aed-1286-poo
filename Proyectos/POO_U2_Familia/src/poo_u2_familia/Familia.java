package poo_u2_familia;

import javax.swing.JOptionPane;
import java.util.*;

public class Familia{
    Persona listado [];
    int cima;
    
    Familia(){
        listado = new Persona[20];
        cima = 0;
    }
    
    public void addPersona(Persona e){
        listado[cima] = e;
        cima++;
    }
    
    public double getPromedio(){
       double suma = 0;
       for(int i = 0; i < cima; ++i)
           suma += listado[i].getGasto_semanal();
       return suma / (double) cima;
    }
    
    public String getMayorGasto(){
        double mayorGasto = listado[0].getGasto_semanal();
        String nombreMayorGasto = listado[0].getNombre();
        
        for(int i = 0; i < cima; ++i){
            if(listado[i].getGasto_semanal() > mayorGasto){
                mayorGasto = listado[i].getGasto_semanal();
                nombreMayorGasto = listado[i].getNombre();
            }
        }
        
        return nombreMayorGasto;
    }
    
    public String getMenorGasto(){
        double menorGasto = listado[0].getGasto_semanal();
        String nombreMenorGasto = listado[0].getNombre();
        
        for(int i = 0; i < cima; ++i){
            if(listado[i].getGasto_semanal() < menorGasto){
                menorGasto = listado[i].getGasto_semanal();
                nombreMenorGasto = listado[i].getNombre();
            }
        }
        
        return nombreMenorGasto;
    }
    
    public Persona getDatos(String nombre){
        for(int i = 0; i < cima; ++i)
            if(listado[i].getNombre().equals(nombre))
                return listado[i];
        return null;
    }
    
    public String getReporte(){
        String reporte = "";
        for(int i = 0; i < cima; ++i)
            reporte += listado[i].getNombre() + " - " + listado[i].getGasto_semanal() + '\n';
        return reporte;
    }
}