/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevoinvernaderoautomatizado;

/**
 *
 * @author cmu08_12mttuz
 */
public class NuevoInvernaderoAutomatizado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Arreglo de plantas tratables
        Tratables[] plantas = new Tratables[3];

        // Crear objetos de tipo Suculentas
        plantas[0] = new Suculentas("Suc-001", "Cactaceae", 8, "Apta");
        plantas[1] = new Suculentas("Suc-002", "Crassulaceae", 14, "Apta");
        plantas[2] = new Suculentas("Suc-003", "Aizoaceae", 19, "Cuarentena");

        System.out.println("NUEVO INVERNADERO AUTOMATIZADO");
        System.out.println("Iniciando hidratacion de suculentas...");
        System.out.println("======================================");

        // Recorrer las plantas e hidratarlas
        for (int i = 0; i < plantas.length; i++) {

            plantas[i].hidratar();

            System.out.println("-------------------------------");
        }

    }
}//Fin de class Main
