package p1_u2_estudiante;

public class Materia {
    private String nombre;
    private String clave;
    private int noCreditos;
    
    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getNoCreditos() {
        return noCreditos;
    }
    
    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNoCreditos(int noCreditos) {
        this.noCreditos = noCreditos;
    }
}
