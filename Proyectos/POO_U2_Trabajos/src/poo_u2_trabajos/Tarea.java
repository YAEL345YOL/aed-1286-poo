package poo_u2_trabajos;

public class Tarea {
    private String actividad;
    private double costo;
    private String descripcion;
    private String unidadMedidad;
    
    public void setActividad(String actividad) { this.actividad = actividad; }
    public void setCosto(double costo) { this.costo = costo; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setUnidadMedidad(String unidadMedidad) { this.unidadMedidad = unidadMedidad; }
    
    public String getActividad() { return actividad; }
    public double getCosto() { return costo; }
    public String getDescripcion() { return descripcion; }
    public String getUnidadMedidad() { return unidadMedidad; }
}
