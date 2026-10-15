package poo_u3_herencia_terreno;

public class Terreno extends Rectangulo {
    private double precio_por_m2;
    
    public Terreno(){
        this.precio_por_m2 = 1000.0;
    }
    
    public Terreno(double ancho, double largo, double precio_por_m2){
        super(ancho, largo);
        this.precio_por_m2 = precio_por_m2;
    }

    public double getPrecio_por_m2() {
        return precio_por_m2;
    }

    public void setPrecio_por_m2(double precio_por_m2) {
        this.precio_por_m2 = precio_por_m2;
    }
    
    public double costoTerreno(){
        return area() * precio_por_m2;
    }
}

