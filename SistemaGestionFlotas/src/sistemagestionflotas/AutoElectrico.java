/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionflotas;

/**
 *
 * @author cmu08_12mttuz
 */
public class AutoElectrico extends VehiculosBase implements IConducible, IElectrico {

    private int nivelBateria;
    
    //Constructur
    public AutoElectrico (String marca, double precioBase, int nivelBateria){
    super(marca, precioBase); 
        setNivelBateria(nivelBateria);
    }
    
//Getter y Setter
    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        } else {
            System.out.println("Valor no posble en bateria");
            this.nivelBateria = 0;
        }

    }//fin set setNivelBateria
    
    //Metodos
    @Override
    public void cargarBateria(int horas){
        System.out.printf("Conectando %s a la red de la ENEE.\n", getMarca());
        System.out.printf("Tiempo estimado de carga: %d", horas);
    }
    
    @Override
    public void encenderMotor(String tipoLlave){
        System.out.println("Encendiendo el carro electrico\n");
        System.out.println("La llave es :"+tipoLlave);
        this.enMovimiento = true;        
    }
    
    @Override
    public void mostrarDatosVehiculos() {
        revisarSistemasInternos();
        System.out.printf("Precio: %.2f\n",getPrecioBase());
        System.out.printf("Marca: %s\n",getMarca());
        System.out.printf("Carga de bateria: %d\n",getNivelBateria());
    }
    
}//Finnde CLASS AutoElectrico
