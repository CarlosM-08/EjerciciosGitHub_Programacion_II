/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author cmu08_12mttuz
 */
public class SistemaEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante Oscar = new Estudiante();
        Estudiante Daniel = new Estudiante(15, 1.9);
        
        Oscar.MostrarDatos();
        Daniel.MostrarDatos();
        
        Daniel.nombre = "Daniel";
        Oscar.nombre = "Oscar";
        
        Daniel.setEdad(50);
        Daniel.MostrarDatos();
        Daniel.setEdad(150);
        Daniel.MostrarDatos();
        
        
        
    }//Fin MAIN
    
}//Fin CLASS
