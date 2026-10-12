package com.mycompany.poo_u2_p4;

public class Mobiliario {
    private String mesa;
    private String vestimenta;
    private String descripcion;
    private double preciomesa;

    public Mobiliario(){
        this.mesa = "Sin mesa";
        this.vestimenta = "Sin vestimenta";
        this.descripcion = "Sin descripción";
        this.preciomesa = 0;
    }

    public Mobiliario(String mesa, String vestimenta, String descripcion, double preciomesa) {
        this.mesa = mesa;
        this.vestimenta = vestimenta;
        this.descripcion = descripcion;
        this.preciomesa = preciomesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public void setVestimenta(String vestimenta) {
        this.vestimenta = vestimenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPreciomesa(double preciomesa) {
        this.preciomesa = preciomesa;
    }

    public String getMesa() {
        return mesa;
    }

    public String getVestimenta() {
        return vestimenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPreciomesa() {
        return preciomesa;
    }
    
    public double costo() {
        if (mesa.equals("Basica") && vestimenta.equals("Casual"))
            preciomesa = 1500;
        else if (mesa.equals("Basica") && vestimenta.equals("Formal"))
            preciomesa = 1800;
        else if (mesa.equals("Elegante") && vestimenta.equals("Formal"))
            preciomesa = 2500;
        else if (mesa.equals("Elegante") && vestimenta.equals("Etiqueta"))
            preciomesa = 3000;
        else if (mesa.equals("VIP") && vestimenta.equals("Formal"))
            preciomesa = 3500;
        else if (mesa.equals("VIP") && vestimenta.equals("Etiqueta"))
            preciomesa = 4500;
        
        return preciomesa;
    }
    
    public String informe(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "=".repeat(44);
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("%25s%n", "MOBILIARIO"));
        
        aux.append(String.format(
            "Tipo: %s%nVestimenta: %s%nDescripción: %s%nPrecio mesa: $%,.2f%n",
            mesa,
            vestimenta,
            descripcion,
            costo()
        ));
        
        return aux.toString();
    }
}
