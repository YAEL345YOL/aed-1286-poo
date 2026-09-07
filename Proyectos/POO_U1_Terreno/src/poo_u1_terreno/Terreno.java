package poo_u1_terreno;

public class Terreno {
    private double frente;
    private double fondo;
    private double costoxm2;
    private String domicilio;
    
//    public Terreno(double frente, double fondo, double costoxm2, String domicilio){
//        this.frente = frente;
//        this.fondo = fondo;
//        this.costoxm2 = costoxm2;
//        this.domicilio = domicilio;
//    }
    
    public void setFrente(double frente){ this.frente = frente;}
    public void setFondo(double fondo){ this.fondo = fondo; }
    public void setCostoxm2(double costoxm2){ this.costoxm2 = costoxm2; }
    public void setDomilicio(String domicilio){ this.domicilio = domicilio; }
    
    public double getFrente(){ return frente; }
    public double getFondo(){ return fondo; }
    public double getCostoxm2(){ return costoxm2; }
    public String getDomilicio(){ return domicilio; }
    
    public double area(){ return fondo * frente; }
    public double precioT(){ return area() * costoxm2; }
    public double perimetro(){ return 2 * (frente + fondo); }
}