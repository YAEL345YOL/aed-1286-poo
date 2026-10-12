package com.mycompany.poo_u2_p4;

public class Banquete {
    private String tipo;
    private String descripcion;
    private double ppp;
    private Boolean carnico;

    public Banquete(){
        this.tipo = "Sin tipo";
        this.descripcion = "Sin descripcion";
        this.ppp = 0;
        this.carnico = false;
    }

    public Banquete(String tipo, String descripcion, double ppp, Boolean carnico){
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.ppp = ppp;
        this.carnico = carnico;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPpp(double ppp) {
        this.ppp = ppp;
    }

    public void setCarnico(Boolean carnico) {
        this.carnico = carnico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPpp() {
        return ppp;
    }

    public Boolean getCarnico() {
        return carnico;
    }
    
    public double costo() {
        if (tipo.equals("Basico"))
            ppp = 200;
        else if (tipo.equals("Boda"))
            ppp = 250;
        else if (tipo.equals("Graduacion"))
            ppp = 270;
        else if (tipo.equals("Empresarial"))
            ppp = 400;
        else if (tipo.equals("Infantil"))
            ppp = 100;

        return ppp;
    }
    
    
    public String informe(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "=".repeat(44);
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("%25s%n", "BANQUETE"));
        
        aux.append(String.format(
            "Tipo: %s%nDescripción: %s%nCárnico: " + (carnico ? "SI" : "NO") + "%nPrecio por persona: $%.2f%n",
            tipo,
            descripcion,
            costo()
        ));
        
        return aux.toString();
    }
}
