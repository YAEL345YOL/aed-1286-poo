package poo_u1_terreno;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Terreno t0 = new Terreno(); // 10 20 1000
        Terreno t1 = new Terreno(); // 7 18 6000
        Terreno t2 = new Terreno(); // 5 15 2000    
        
        Terreno a[] = {t0, t1, t2};
        
        double promedio = 0;

        String sFrente = JOptionPane.showInputDialog("Teclado frente...");
        t0.setFrente(Double.parseDouble(sFrente));
        
        String sFondo = JOptionPane.showInputDialog("Teclado fondo...");
        t0.setFondo(Double.parseDouble(sFondo));
        
        String sCostomxm2 = JOptionPane.showInputDialog("Teclado costo por metro cuadrado...");
        t0.setCostoxm2(Double.parseDouble(sCostomxm2));
        
        JOptionPane.showMessageDialog(null, "El terreno T0 vale : " + t0.precioT());
        
        promedio += t0.precioT();
        
        String sFrente1 = JOptionPane.showInputDialog("Teclado frente...");
        t1.setFrente(Double.parseDouble(sFrente1));
        
        String sFondo1 = JOptionPane.showInputDialog("Teclado fondo...");
        t1.setFondo(Double.parseDouble(sFondo1));
        
        String sCostomxm21 = JOptionPane.showInputDialog("Teclado costo por metro cuadrado...");
        t1.setCostoxm2(Double.parseDouble(sCostomxm21));
        
        JOptionPane.showMessageDialog(null, "El terreno T0 vale : " + t1.precioT());
        
        promedio += t1.precioT();
        
        String sFrente2 = JOptionPane.showInputDialog("Teclado frente...");
        t2.setFrente(Double.parseDouble(sFrente2));
        
        String sFondo2 = JOptionPane.showInputDialog("Teclado fondo...");
        t2.setFondo(Double.parseDouble(sFondo2));
        
        String sCostomxm22 = JOptionPane.showInputDialog("Teclado costo por metro cuadrado...");
        t2.setCostoxm2(Double.parseDouble(sCostomxm22));
        
        JOptionPane.showMessageDialog(null, "El terreno T0 vale : " + t2.precioT());
        
        promedio += t2.precioT();
        
        JOptionPane.showMessageDialog(null, "El promedio vale : " + promedio / 3.0);
        
//        String sDom = JOptionPane.showInputDialog("Teclado domicilio...");
//        t0.setDomilicio(sDom);
        
    }
}
