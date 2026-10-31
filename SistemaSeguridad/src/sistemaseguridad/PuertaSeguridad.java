/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaseguridad;

/**
 *
 * @author cmu08_12mttuz
 */
public class PuertaSeguridad {
    
    //Atributos
    private int pinMaestro;
    private boolean puestaAbierta;
    private boolean modoLockdown;
    private int bateriaRespaldo;
    
    //Costructor 
    public PuertaSeguridad(int pinInicial){
    this.pinMaestro = pinInicial;
    this.puestaAbierta = false;
    this.modoLockdown = false;
    this.bateriaRespaldo = 100;
    }//Fin de constructor PuestaSeguridad
    
    public void cambiarpin(int pinActual, int pinNuevo) {
        if (pinActual == this.pinMaestro) {
            if (pinNuevo >= 1000 && pinNuevo <= 9999) {
                this.pinMaestro = pinNuevo;
                System.out.println("Pin Actualizado");
            } else {
                System.out.println("Pin Fuefa de rango");
            }
        }else{
            System.out.println("Pin Actual es Incorrecto");
        }
    }//Fin Funcion Setter Cambiar Pin
    
    public boolean validarPin(int pinIntento) {
        boolean resultado;
        if (this.pinMaestro == pinIntento) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }// Fin funcion Getter validadPin
    
    public void activarLockdown(){
    this.modoLockdown = true;
    this.puestaAbierta = false;
        System.out.println("Lock Down Activado.... modo encierro!!");
    }//Fin funcion SETTER Activar LockDown

    public void desactivarLockdown(){
    this.modoLockdown = false;
        System.out.println("Lock Down Desactivado.. modo normal operacion");
    }//Fin fucion SETTER Desactivar Lock Down
    
    public boolean getModoLockDown (){
    return modoLockdown;
    }
    
    public int getEstadoBateriaRespaldo(){
    return bateriaRespaldo;
    }
    
    public boolean getEstadoPuerta(){
    return puestaAbierta;
    }
    
    public void setPuerta(boolean modoPuerta){
    this.puestaAbierta = modoPuerta;
    }
    
    public void setBateriaRespaldo(int bateria) {
        if (bateria < 0) {
            this.bateriaRespaldo = 0;
        } else if (bateria >= 100) {
            this.bateriaRespaldo = 100;
            System.out.println("");
        } else {
            this.bateriaRespaldo = bateria;
        }
    }//Fin Funcion Bateria Respaldo
    
    
}//Fin de class PuestraSeguridad
