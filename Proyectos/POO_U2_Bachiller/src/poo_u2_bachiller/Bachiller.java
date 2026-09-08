package poo_u2_bachiller;

public class Bachiller {
    private String nombre;
    private String carrera;
    private double calificacion;
    private String cualificacion;
    
    // ============ GETERS ============ //

    public String getNombre() { return nombre; }
    public String getCarrera() { return carrera; }
    public double getCalif() { return calificacion; }
    public String getCualificacion(){ return cualificacion; }
    
    // ============ SETTERS ============ //

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCarrera(String carrera) { this.carrera = carrera;}
    public void setCalif(double calificacion) { this.calificacion = calificacion; }
    public void setCualificacion(String cualificacion) { this.cualificacion = cualificacion; }

    // ============ UTILS ============ //
    
    public void calcCualificacion() {
        if(calificacion > 0 && calificacion < 6){
           cualificacion = "Insuficiente";
        }
        else if(calificacion >= 6 && calificacion < 8){
            cualificacion = "Suficiente";
        }
        else if(calificacion >= 8 && calificacion <= 9){
            cualificacion = "Bueno";
        }
        else if(calificacion > 9 && calificacion <= 10){
            cualificacion = "Exelente";
        }
    }
    
    
    
}
