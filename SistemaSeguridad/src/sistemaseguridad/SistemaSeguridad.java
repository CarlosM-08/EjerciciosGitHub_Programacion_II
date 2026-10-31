/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaseguridad;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class SistemaSeguridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in); 
          
          PuertaSeguridad accesoDC = new PuertaSeguridad(2026);
          boolean panelEncendido = true;
          int opcionSeleccion = 0;
          
          System.out.println("Terminal de puerta Encendido");
          
          
          while (panelEncendido) {
              System.out.println("Menu Encendido");
              System.out.println("1. Intentar abrir Puerta");
              System.out.println("2. Cambir Codigo Pin");
              System.out.println("3. Alternar Estado Emergencia");
              System.out.println("4. Mantenimiento");
              System.out.println("5. Apagar Terminal de Puerta");
              System.out.print("\nSeleccion: ");
              opcionSeleccion = scan.nextInt();
              
              switch (opcionSeleccion) {
                  case 1:
                      System.out.println("Ingrese codigo: ");
                      int intentoPin = scan.nextInt();
                      boolean resultadoIntento = accesoDC.validarPin(intentoPin);
                      if (accesoDC.getEstadoBateriaRespaldo() < 5) {
                          System.out.println("Error de Energia");
                      } else if (accesoDC.getModoLockDown()) {
                          System.out.println("Modo Encierro Activo");
                      } else if (!resultadoIntento){
                          System.out.println("Credencial No Valida");
                          int valorBateria = accesoDC.getEstadoBateriaRespaldo();
                          accesoDC.setBateriaRespaldo(valorBateria - 15);
                      }
                      else{
                              System.out.println("Acceso Concebido!!");
                              int valorBateria = accesoDC.getEstadoBateriaRespaldo();
                                  accesoDC.setBateriaRespaldo(valorBateria - 5);
                              }

                      break;
                  default:
                      throw new AssertionError();
              }
        }
        
    }//Fin de Main
    
}//Fin de Class
