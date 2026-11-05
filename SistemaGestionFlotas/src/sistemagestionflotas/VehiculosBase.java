/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflotas;

/**
 *
 * @author cmu08_12mttuz
 */
public abstract class VehiculosBase {

    
    private String marca;
    private double precioBase;
    protected boolean enMovimiento;
    
    //Constructor
    public VehiculosBase (String marca, double precioBase){
        setMarca(marca);
        setPrecioBase(precioBase);
    this.enMovimiento = false;
    }
    
    //GETTER y SETTER
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("Marca Invalida... no se reconoce");
            this.marca = "Sin marca";
        } else {
            this.marca = marca;
        }
    }//Fin setMarca

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 1000) {
            System.out.println("Advertencia... precio no valido!!!");
            this.precioBase = 1000;
        } else {
            this.precioBase = precioBase;
        }

    }//Fin setPrecioBase
    
    protected void revisarSistemasInternos() {
        System.out.println("Revisando sistemas del vehículo...");
    }//Fin metodo revisarSistemasInternos
    
    abstract void mostrarDatosVehiculos();
    
    
}//Fin de CLASS VehiculosBase
