/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cmu08_12mttuz
 */
public class Equipo {
    private String codigo;
    private String nombre;
    private double precio;
    private boolean garantia;
    private boolean calibracion;
    private String categoria;
    
    public Equipo(String codigo, String nombre, double precio, boolean garantia, boolean calibracion, String categoria){
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
    this.garantia = garantia;
    this.calibracion = calibracion;
    this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public double getPrecioFinal() {
        double precioFinal = 0;
        if (garantia) {
            precioFinal = this.precio * 1.10;
        } else {
            precioFinal = this.precio;
        }
        return precioFinal;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public boolean isCalibracion() {
        return calibracion;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public Object[] toObjectArray() {
        return new Object[]{
            codigo,
            nombre,
            categoria,
            garantia ? "Sí (+10%)" : "No",
            calibracion ? "Sí" : "No",
            String.format("%.2f", getPrecioFinal())
        };
    }//Fin de Objeto
    
    
    
    
    
}//Fin de Class Equipo
