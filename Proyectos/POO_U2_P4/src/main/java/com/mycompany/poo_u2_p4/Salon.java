package com.mycompany.poo_u2_p4;

public class Salon {
    private String nombre;
    private String tipo;
    private Boolean aireLibre;
    private String descripcion;
    private int cupo;
    
    public Salon(){
        this.nombre = "Sin nombre";
        this.tipo = "Sin tipo";
        this.aireLibre = false;
        this.descripcion = "Sin descripción";
        this.cupo = 0;
    }

    public Salon(String nombre, String tipo, Boolean aireLibre, String descripcion, int cupo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.aireLibre = aireLibre;
        this.descripcion = descripcion;
        this.cupo = cupo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setAireLibre(Boolean aireLibre){
        this.aireLibre = aireLibre; 
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setCupo(int cupo){
        this.cupo = cupo; 
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }

    public Boolean getAireLibre(){
        return aireLibre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getCupo(){
        return cupo;
    } 
    
    public double costo(){
        int coste = 0;
        
        if(tipo.equals("Jardin"))
            coste = 8000;
        else if(tipo.equals("Fiesta"))
            coste = 6000;
        else if(tipo.equals("Terraza"))
            coste = 7000;
        else if(tipo.equals("Premiun"))
            coste = 12000;
        
        return (aireLibre ? 2 : 1) * coste;         
    }
    
    public String informe(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "=".repeat(44);
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("%25s%n", "SALON"));
        
        aux.append(String.format(
            "Nombre: %s%nTipo: %s%nDescripción: %s%nAl aire libre: " + (aireLibre ? "SI" : "NO") + "%nCupo: %d%n",
            nombre,
            tipo,
            descripcion,
            cupo
        ));
        
        return aux.toString();
    }
}
