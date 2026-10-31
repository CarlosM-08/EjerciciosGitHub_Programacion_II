/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;

/**
 *
 * @author cmu08_12mttuz
 */
public class BugSeguridad extends Bugs {
    private String codigoCVE;
    private boolean datosExpuestos;
    
    public BugSeguridad (String idTicketNIETO, String idTituloNIETO, boolean resueltoNIETO, String entornoHIJO, String codigoCVE, boolean datoEXP){
        super(idTicketNIETO, idTituloNIETO,resueltoNIETO, entornoHIJO);// super es palabra clasve parahacer referencia al constructor de la clase padre
        this.codigoCVE = codigoCVE;
        this.datosExpuestos = datoEXP;
    

}
    
}//Fin de Class BugSeguridad
