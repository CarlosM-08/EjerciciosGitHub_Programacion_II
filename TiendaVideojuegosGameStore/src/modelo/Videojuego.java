/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cmu08_12mttuz
 */
public class Videojuego {

    protected String titulo;
    protected String genero;
    protected double precioBase;
    protected boolean incluyeDLC;
    protected boolean esEdicionEspecial;

    public Videojuego(String titulo, String genero, double preciobase, boolean incluyeDLC, boolean esEdicionEspecial) {
        this.titulo = titulo;
        this.genero = genero;
        this.precioBase = preciobase;
        this.incluyeDLC = incluyeDLC;
        this.esEdicionEspecial = esEdicionEspecial;
    }

    public double calcularPrecioFinal() {
        double precioFinal = this.precioBase;
        
        if (incluyeDLC == true) {
            precioFinal += 15.00;
        }//Fin IF

        if (esEdicionEspecial == true) {
            precioFinal += (this.precioBase * 0.20);
        }// Fin IF

        return precioFinal;
    }// Fin Metodo calcularPrecioFinal

    public String generarFicha() {
        String ficha = "===== GAMESTORE =====\n";

        ficha += "Título: " + titulo + "\n";
        ficha += "Género: " + genero + "\n";
        ficha += String.format("Precio base: $%.2f%n", precioBase);

        if (incluyeDLC) {
            ficha += "Incluye DLC: Sí\n";
        } else {
            ficha += "Incluye DLC: No\n";
        }

        if (esEdicionEspecial) {
            ficha += "Edición especial: Sí\n";
        } else {
            ficha += "Edición especial: No\n";
        }

        return ficha;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    
}
