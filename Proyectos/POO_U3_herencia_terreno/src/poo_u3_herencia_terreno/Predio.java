package poo_u3_herencia_terreno;

public class Predio extends Terreno {
    private double costoLinealBardeado;
    
    public Predio(){
        this.costoLinealBardeado = 0.0;
    }
    
    public Predio(double ancho, double largo, double precio_por_m2, double costoLinealBardeado){
        super(ancho, largo, precio_por_m2);
        this.costoLinealBardeado = costoLinealBardeado;
    }

    public double getCostoLinealBardeado() {
        return costoLinealBardeado;
    }

    public void setCostoLinealBardeado(double costoLinealBardeado) {
        this.costoLinealBardeado = costoLinealBardeado;
    }
    
    public double costoPredio(){
        return 2 * (getAncho() + getLargo()) * costoLinealBardeado + costoTerreno();
    }
    
    public String reporte(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "=======================";
        
        aux.append(separador).append(String.format("%n"));
        
        aux.append(String.format("%25s%n", "REPORTE TERRENO"));
        
        aux.append(separador).append(String.format("%n"));
        
        aux.append(
            String.format(
                "Ancho: %,.2f%nLargo: %,.2f%nArea: %,.2fm2%nPrecio por m2: $%,.2f%nCosto Terreno: $%,.2f%nCosto lineal bardeado: $%,.2f%nCosto predio: $%,.2f%n",
                getAncho(),
                getLargo(),
                area(),
                getPrecio_por_m2(),
                costoTerreno(),
                getCostoLinealBardeado(),
                costoPredio()
            )
        );
        
        return aux.toString();
    }
}