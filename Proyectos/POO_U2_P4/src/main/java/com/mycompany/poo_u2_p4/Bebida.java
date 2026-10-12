package com.mycompany.poo_u2_p4;

public class Bebida {
    private String tipo;
    private String descripcion;
    private double ppp;
    
    public Bebida(){
        this.tipo = "Sin tipo";
        this.descripcion = "Sin descripción";
        this.ppp = 0;
    }

    public Bebida(String tipo, String descripcion, double ppp){
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.ppp = ppp;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPpp(double ppp){
        this.ppp = ppp;
    }

    public String getTipo(){
        return tipo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPpp(){
        return ppp;
    }
    
    public double costo(){
        if(tipo.equals("Refresco"))
            ppp = 30;
        else if(tipo.equals("Cerveza"))
            ppp = 45;
        else if(tipo.equals("Tequila"))
            ppp = 80;
        else if(tipo.equals("Whisky"))
            ppp = 120;
        else if(tipo.equals("Agua"))
            ppp = 20;
        
        return ppp;         
    }
    
    public String informe(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "=".repeat(44);
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("%25s%n", "BEBIDAS"));
        
        aux.append(String.format(
            "Tipo: %s%nDescripción: %s%nPrecio por persona: $%,.2f%n",
            tipo,
            descripcion,
            costo()
        ));
        
        return aux.toString();
    }
}
