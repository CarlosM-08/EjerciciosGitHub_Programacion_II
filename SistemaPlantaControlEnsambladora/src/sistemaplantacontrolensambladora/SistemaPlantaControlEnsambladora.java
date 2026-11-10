/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaplantacontrolensambladora;

/**
 * Una planta de manufactura requiere un sistema central (ControladorPlanta) para 
 * orquestar diferentes maquinarias en la línea de ensamblaje. El sistema debe ser 
 * capaz de operar distintos tipos de equipos industriales sin importar su naturaleza 
 * específica, asegurando que todos cumplan con protocolos de mantenimiento.
 * 
 * @author cmu08_12mttuz
 */
public class SistemaPlantaControlEnsambladora {

    /** una clase abstracta es la base que se utilizara 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
        Brazo Robotico
        Maquina X - Rays
        Balanza 
        
        Atributos/Caracteristicas
            NumeroSerie
            estadoOperativo
            horasUso
            capacidadCarga 
        
        Accion
            encender
            apagar
    */  
    
    BrazoRobotico brazo1 = new BrazoRobotico("BRZ-001", "Electrica");
    
    brazo1.iniciarCalibracion();
    brazo1.terminarCalibracion();    
    brazo1.procesarMaterial();
        
    }//Fin de MAIN
    
}//Fin de CLASS
