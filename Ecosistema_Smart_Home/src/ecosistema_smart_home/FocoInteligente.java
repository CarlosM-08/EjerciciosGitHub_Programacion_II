/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosistema_smart_home;

/**
 *
 * @author cmu08_12mttuz
 */

public class FocoInteligente extends Dispositivo implements Conexiones {//Implement se utiliza para hacer referencia a una Interface

    public FocoInteligente(String marca) {
        super(marca);
    }

    @Override
    void encender() {
        System.out.println("Foco encendido al 100%");
    }
    
    @Override
    public void conectarRed(){
        System.out.println("Conectando al router via WIFI");
    }

}//Fin de Class FocoInteligente
