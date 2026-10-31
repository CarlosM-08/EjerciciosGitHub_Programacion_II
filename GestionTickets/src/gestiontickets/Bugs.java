/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author cmu08_12mttuz
 */
public class Bugs extends TareaBase{//se utiliza la palabra extends + nombre de la clase para indicar que se esta herendando atributos de la clase
    private String entorno;
    
    public Bugs(String idTicketHIJO, String tituloHIJO,boolean resueltoHIJO, String entorno) {
        super(idTicketHIJO, tituloHIJO, resueltoHIJO);// los valores dentro del parentesis hacen referencia a los parametros no a los atributos y se utiliza la palabra super
        this.entorno = entorno;
    }
    
    @Override// le da un nuevo comportamiento a la funcion
    public int calcularPrioridad() {
        if (this.entorno.equals("Produccion")) {
            return 3;
        } else {
            return 2;
        }
    }
    
    
}//Fin de Class Bugs
