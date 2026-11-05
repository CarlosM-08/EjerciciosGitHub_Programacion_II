/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflotas;

/**
 *
 * @author cmu08_12mttuz
 */
public class CamionCarga extends VehiculosBase implements IConducible {
    
    private double capacidadCarga;
    
    public CamionCarga (String marca, double precioBase, double capacidadCarga){
    super(marca, precioBase);
        setCapacidadCarga(capacidadCarga);
    }//Fin de Constructor
    
    //Getter y SETTER
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {

        if (capacidadCarga < 0) {
            this.capacidadCarga = 0.0;
            System.out.println("Advertencia... Valor no permitido como capacidad de carga");
        } else {
            this.capacidadCarga = capacidadCarga;
        }
    }//Fin setCapacidadCarga
    
    //Metodos   
    
    @Override
    public void encenderMotor(String tipoLlave){
        System.out.println("Calentadores listos. Encender\n");
        System.out.println("La llave es :"+tipoLlave);
        this.enMovimiento = true;        
    }
    
    @Override
    public void mostrarDatosVehiculos() {
        revisarSistemasInternos();
        System.out.printf("Precio: %.2f\n",getPrecioBase());
        System.out.printf("Marca: %s\n",getMarca());
        System.out.printf("Capacidad de carga: %.2f\n",getCapacidadCarga());
    }
    
    
}//Fin CLASS CamionCarga
