/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class SistemaMonitoreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SensorAmbiental prueba = new SensorAmbiental("AA:BB:CC:DD", 100,0,true);
        Scanner scan = new Scanner(System.in);
        boolean cicloActivo = true;
        char seleccionMenu = 'A';
        
        while(cicloActivo){
            System.out.println("Menus de Control");
            System.out.println("1. Ingresar nueva Lectura Termica");
            System.out.println("2. Actualizar lectura del Hidrometro");
            System.out.println("3. Solicitud de Diagostico Completo");
            System.out.println("4. Inicio de Secuencia de Apagado");
            System.out.print("\nSeleccion: ");
            seleccionMenu = scan.next().charAt(0);
            
            switch (seleccionMenu) {
                case '1':
                    System.out.print("Ingresa Temperatura: ");
                    double nuevaTemp = scan.nextDouble();
                    prueba.setTemperatura(nuevaTemp);
                    break;
                case '2':
                    System.out.print("Ingresa HR: ");
                    int nuevaHR = scan.nextInt();
                    prueba.setHumedadRelativa(nuevaHR);
                    break;
                case '3':
                    prueba.reporteEstado();
                    break;
                case '4':
                    cicloActivo = false;
                    System.out.println("Cerrando...cerrando");
                    System.out.println("Ya casii....");
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Compa... es del 1 al 4");
                    System.out.println("Esa opcion que pusiste no existe");
            }//Fin de Swith
            
        }//Fin de While
        
    }//Fin de Main
    
}//Fin de Class
