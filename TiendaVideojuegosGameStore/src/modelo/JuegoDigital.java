/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cmu08_12mttuz
 */
public class JuegoDigital extends Videojuego {
    private double porcentajeDescuento;
    private String codigoActivacion;
    
    public JuegoDigital(String titulo, String genero, double preciobase, boolean incluyeDLC, boolean esEdicionEspecial, double porcentajeDescuento){        
        super(titulo, genero, preciobase, incluyeDLC, esEdicionEspecial);
        this.porcentajeDescuento = porcentajeDescuento;
        this.codigoActivacion = "GS-" + (int)(Math.random() * 9000 + 1000) + "-DIG";    
    }//Fin constructor
    
    @Override
    public double calcularPrecioFinal() {
        double subTotal = super.calcularPrecioFinal();
        subTotal -= subTotal * porcentajeDescuento;
        return subTotal;
    }// Fin Metodo calcularPrecioFinal
    
    @Override
    public String generarFicha() {
        String ficha = super.generarFicha();

        ficha += "Formato: Digital\n";
        ficha += String.format("Porcentaje de descuento aplicado: %.0f%%\n", porcentajeDescuento*100);
        ficha += String.format("Clave de activacion generada: %s\n", codigoActivacion);
        ficha += String.format("TOTAL A PAGAR: $%.2f%n", calcularPrecioFinal());

        return ficha;

    }//Fin de Metodo generarFicha
    
    
}//FIn Class JuegoDigital
