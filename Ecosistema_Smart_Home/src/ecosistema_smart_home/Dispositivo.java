/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosistema_smart_home;

/**
 *
 * @author cmu08_12mttuz
 */
public abstract class Dispositivo {
    //Atributos
    String marca;
    
    //Constructor
    public Dispositivo (String marca){
    this.marca = marca;
    }
    
    //Metodos
    abstract void encender();//Su funcion depende de lo queel objeto va a ser
    
    public void MostrarMarca(){
        System.out.println("Marca: "+this.marca);
    }//Fin de metodo MostrarMarca
    
    
}//Fin Abstract Class Dispositivo
