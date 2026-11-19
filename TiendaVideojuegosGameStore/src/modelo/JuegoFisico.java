/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cmu08_12mttuz
 */
public class JuegoFisico extends Videojuego{
   private double costoEnvio;
    
public JuegoFisico (String titulo, String genero, double preciobase, boolean incluyeDLC, boolean esEdicionEspecial, double costoEnvio){
super(titulo, genero, preciobase, incluyeDLC, esEdicionEspecial);
this.costoEnvio = costoEnvio;
}    

@Override

public double calcularPrecioFinal() {
        double precioFinal = super.calcularPrecioFinal();
        precioFinal += costoEnvio;
        return precioFinal;
    }// Fin Metodo calcularPrecioFinal

@ Override

public String generarFicha() {
String ficha = super.generarFicha();

ficha += "Formato: FÍSICO\n";
    ficha += String.format("Costo de envío: $%.2f%n", costoEnvio);
    ficha += String.format("TOTAL A PAGAR: $%.2f%n", calcularPrecioFinal());

    return ficha;

}//Fin de Metodo generarFicha
    
}//Fin Clase JuegoFisico
