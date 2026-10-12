package com.mycompany.poo_u2_p4;

public class Fiesta {
    private Musica musica;
    private Banquete banquete;
    private Bebida bebida;
    private Salon salon;
    private Mobiliario mobiliario;
    private int noAsistentes;

    public Fiesta(Musica musica, Banquete banquete, Bebida bebida, Salon salon, Mobiliario mobiliario, int noAsistentes){
        this.musica = musica;
        this.banquete = banquete;
        this.bebida = bebida;
        this.salon = salon;
        this.mobiliario = mobiliario;
        this.noAsistentes = noAsistentes;
    }

    public void setMusica(Musica musica){
        this.musica = musica;
    }

    public void setBanquete(Banquete banquete){
        this.banquete = banquete;
    }

    public void setBebida(Bebida bebida){
        this.bebida = bebida;
    }

    public void setSalon(Salon salon){
        this.salon = salon;
    }

    public void setMobiliario(Mobiliario mobiliario){
        this.mobiliario = mobiliario;
    }

    public void setNoAsistentes(int noAsistentes){
        this.noAsistentes = noAsistentes;
    }

    public Musica getMusica(){
        return musica;
    }

    public Banquete getBanquete(){
        return banquete;
    }

    public Bebida getBebida(){
        return bebida;
    }

    public Salon getSalon(){
        return salon;
    }

    public Mobiliario getMobiliario(){
        return mobiliario;
    }

    public int getNoAsistentes(){
        return noAsistentes;
    }
    
    public double costo(){
        return salon.costo() 
             + musica.costo()
             + Math.ceil(noAsistentes / 10.0) * mobiliario.costo()
             + banquete.costo() * noAsistentes
             + bebida.costo() * noAsistentes;
    }
    
    public String informe(){
        StringBuilder aux = new StringBuilder();
        
        String separador = "=".repeat(44);
        String separador1 = "-".repeat(44);
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("%31s%n", "EVENTOS LOS PINOS"));
        aux.append(String.format("%31s%n", "COTIZACIÓN DE EVENTO"));
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("Número de asistentes: %d%n", noAsistentes));
                
        aux.append(musica.informe());
        aux.append(separador1).append("\n");
        aux.append(String.format("Costo: $%,.2f%n", musica.costo()));
        
        aux.append(banquete.informe());
        aux.append(separador1).append("\n");
        aux.append(String.format("Costo: $%,.2f%n", banquete.costo() * noAsistentes));
        
        aux.append(bebida.informe());
        aux.append(separador1).append("\n");
        aux.append(String.format("Costo: $%,.2f%n", bebida.costo() * noAsistentes));
        
        aux.append(salon.informe());
        aux.append(separador1).append("\n");
        aux.append(String.format("Costo: $%,.2f%n", salon.costo()));
        
        int k = (int) Math.ceil(noAsistentes / 10.0);
        
        aux.append(mobiliario.informe());
        aux.append(String.format("Costo: $%,.2f (" + k + " mesas)%n", k * mobiliario.costo()));
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("Total: $%,.2f%n", costo()));
        
        aux.append(separador).append("\n");
        
        aux.append(String.format("%35s%n", "GRACIAS POR SU PREFERENCIA"));
        aux.append(String.format("%34s%n", "CONSERVE ESTE COMPROBANTE"));
        aux.append(String.format("%34s%n", "*** FIN DEL TICKET ***"));
       
        
        return aux.toString();
    }
}
