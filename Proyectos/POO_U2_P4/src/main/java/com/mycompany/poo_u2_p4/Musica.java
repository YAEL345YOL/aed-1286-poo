package com.mycompany.poo_u2_p4;

public class Musica {
    private String tipo;
    private Boolean vivo;
    private String descripcion;
    private String clasificacion;
    
    public Musica(){
        this.tipo = "No definido";
        this.vivo = true;
        this.descripcion = "No definido";
        this.clasificacion = "No definido";
    }

    public Musica(String tipo, Boolean vivo, String descripcion, String clasificacion){
        this.tipo = tipo;
        this.vivo = vivo;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
    }

    public void setTipo(String tipo){
        this.tipo = tipo; 
    }

    public void setVivo(Boolean vivo){
        this.vivo = vivo; 
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion; 
    }

    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion; 
    }

    public String getTipo(){
        return tipo; 
    }

    public Boolean getVivo(){
        return vivo; 
    }

    public String getDescripcion(){
        return descripcion; 
    }

    public String getClasificacion(){
        return clasificacion; 
    }
    
    public double costo(){
        int coste = 0;
        
        if(tipo.equals("Rock"))
            coste = 3500;
        else if(tipo.equals("Pop"))
            coste = 4000;
        else if(tipo.equals("Banda"))
            coste = 4500;
        else if(tipo.equals("Corridos"))
            coste = 8000;
        else if(tipo.equals("Reggaeton"))
            coste = 7500;
        
        return (vivo ? 3 : 1) * coste;         
    }
    
    public String informe(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "=".repeat(44);
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("%25s%n", "MÚSICA"));
        
        aux.append(String.format(
            "Tipo: %s%nDescripción: %s%nEn vivo: " + (vivo ? "SI" : "NO") + "%nClasificación: %s%n",
            tipo,
            descripcion,
            clasificacion
        ));
        
        return aux.toString();
    }
}
