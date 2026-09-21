package poo_u2_familia;

import javax.swing.JOptionPane;
import java.util.*;

public class Persona {
    private String nombre;
    private String rfc;
    private String email;
    private String telefono;
    private double gasto_semanal;
    
    Persona(String nombre, String rfc, String email, String telefono, double gasto_semanal){
        this.nombre = nombre;
        this.rfc = rfc;
        this.email = email;
        this.telefono = telefono;
        this.gasto_semanal = gasto_semanal;
    }
    
    ///////////// GETTERS /////////////

    public String getNombre() { return nombre; }
    public String getRfc() { return rfc; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public double getGasto_semanal() { return gasto_semanal; }
    
    ///////////// SETTERS /////////////

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRfc(String rfc) { this.rfc = rfc; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setGasto_semanal(double gasto_semanal) { this.gasto_semanal = gasto_semanal; }
}