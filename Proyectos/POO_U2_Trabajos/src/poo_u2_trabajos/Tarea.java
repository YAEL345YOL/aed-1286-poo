package poo_u2_trabajos;

public class Tarea {
    private String actividad;
    private double costo;
    private String descripcion;
    private String unidadMedidad;

    ///////// SETTERS /////////
    
    public void setActividad(String actividad) { this.actividad = actividad; }
    public void setCosto(double costo) { this.costo = costo; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setUnidadMedidad(String unidadMedidad) { this.unidadMedidad = unidadMedidad; }

    ///////// GETTERS /////////
    
    public String getActividad() { return actividad; }
    public double getCosto() { return costo; }
    public String getDescripcion() { return descripcion; }
    public String getUnidadMedidad() { return unidadMedidad; }
    
    @Override
    public String toString() {
        return "Actividad: " + actividad + "\n" +
                "Costo: $" + costo + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Unidad de medida: " + unidadMedidad + "\n";
    }
}
