/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontickets;// HERENCIA

/**
 *
 * @author cmu08_12mttuz
 */
public class TareaBase {
    private String idTicket; 
    private String titulo;
    
    protected boolean resuelto;
    
    
    public TareaBase(String idTicket, String titulo, boolean resuelto){
    
    this.idTicket = idTicket;
    this.titulo = titulo;
    this.resuelto = resuelto;
    
    }//Fin de Constructor
    
    public void marcaResuelto(){//Set de resuelto
    this.resuelto = true;
        System.out.printf("El ticket %s ha sido cerrado.\n",this.idTicket);
        System.out.printf("Nombre Ticket %s",this.titulo);
    }
    
    public int calcularPrioridad(){
    return 1;
    }
    
    
}//Fin de class Tarea Base


//Don't repeat yourself (DRY)