package poo_u2_chicoresponsable;

public class Chico {
    private String nombre;
    private String curp;
    private String telefono;
    private double gastos[];
    private String conceptos[];
    private int cima;
    
    public Chico(){ 
        this.nombre = "Juan Perez";
        this.curp = "PEJU050410HMNZD24";
        this.telefono = "524433245678";
        conceptos = new String[20];
        gastos = new double[20];
        cima = 0;
    }
    
    public Chico(String nombre, String curp, String telefono){ 
        this.nombre = nombre;
        this.curp = curp;
        this.telefono = telefono;
        conceptos = new String[20];
        gastos = new double[20];
        cima = 0;
    }
    
    ////////////////// SETTERS //////////////////

    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCurp(String curp) { this.curp = curp; }
    
    ////////////////// GETTERS //////////////////

    public String getNombre() { return nombre; }
    public String getCurp() { return curp; }
    public String getTelefono() { return telefono; }
    
    ////////////////// UTILS //////////////////
        
    public void setConcepto(String concepto, double gasto){
        conceptos[cima] = concepto;
        gastos[cima] = gasto;
        cima++;
    }
    
    public double promedio(){
        if(cima == 0) return -1; 
        double suma = 0;
        for(int i = 0; i < cima; ++i)
            suma += gastos[i];
        return suma / (double) cima;
    }
    
    public String conceptoAlto(){
        if(cima == 0) return null;
        
        String nombreConceptoAlto = conceptos[0];
        double maxConcepto = gastos[0];
        
        for(int i = 0; i < cima; ++i){
            if(gastos[i] > maxConcepto){
                maxConcepto = gastos[i];
                nombreConceptoAlto = conceptos[i];
            }
        }
        
        return nombreConceptoAlto;
    }
    
     public String conceptoBajo(){
        if(cima == 0) return null;
         
        String nombreConceptoBajo = conceptos[0];
        double minConcepto = gastos[0];
        
        for(int i = 0; i < cima; ++i){
            if(gastos[i] < minConcepto){
                minConcepto = gastos[i];
                nombreConceptoBajo = conceptos[i];
            }
        }
        
        return nombreConceptoBajo;
    }
}
