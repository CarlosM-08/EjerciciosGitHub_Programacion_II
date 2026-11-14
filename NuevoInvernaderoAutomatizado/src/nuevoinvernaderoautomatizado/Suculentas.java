/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoinvernaderoautomatizado;

/**
 *
 * @author cmu08_12mttuz
 */

public class Suculentas extends Planta implements Tratables {

    // Constructor
    public Suculentas(String codRegistro, String famTaxonomica, double nivHumedad, String estVital) {
        super(codRegistro, famTaxonomica, nivHumedad, estVital);
    }

    // Metodo para hidratar la planta
    @Override
    public void hidratar() {

        System.out.println("Codigo de registro: " + getCodRegistro());
        System.out.println("Nivel de humedad: " + nivHumedad);

        nivHumedad = nivHumedad + 2;

        System.out.println("Nuevo nivel de humedad: " + nivHumedad);

        if (nivHumedad > 15) {
            System.out.println("ALERTA!!! Riesgo de pudricion");
        } else {
            System.out.println("Hidratacion correcta");
        }
    }

    // Metodo para podar la planta
    @Override
    public void podar() {
        System.out.println("Podando suculenta: " + getCodRegistro());
    }

}//Fin de class Suculenta

