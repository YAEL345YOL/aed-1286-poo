package poo_u3_herencia_terreno;

public class Rectangulo {
    private double ancho;
    private double largo;
    
    public Rectangulo(){
        this.ancho = 10.0;
        this.largo = 20.0;
    }
    
    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }
    
    public double area(){
        return ancho * largo;
    }
}
