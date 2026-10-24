/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author cmu08_12mttuz
 */
public class Estudiante {

    /*Modificadores de acceso
    1. public
    2. private
    3. protected
     */
    //Atributos (variables) -> solamente se colocan las caracteristicas
    private int edad; //solo se permite trabajar la edad desde la clase estudiante
    private double estatura;

    String nombre;
    String apellido;

    char genero;

    //constructor -> asignar valores iniciales a los atributos de un objeto -> Siempre se debe colocar un constructor
    public Estudiante() {
        this.edad = 0;
        this.estatura = 0;
        this.nombre = "John";
        this.apellido = "Doe"; // se le coloca la palabra this se obliga a hacer referencia al atributo directamente de la clase y no a un parametro   
    }//Fin de Constructor 1

    public Estudiante(int edad, double estatura) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = "John";
        this.apellido = "Doe";
    }//Fin de Constructor 2

    //Metodo (funcion)
    public void MostrarDatos() {
        System.out.printf("\nNombre: %s\n", this.nombre);
        System.out.printf("Apellido: %s\n", this.apellido);
        System.out.printf("Edad: %d\n", this.edad);
        System.out.printf("Estatura: %.2f\n", this.estatura);
    }//Fin de Metodo MostrarDatos

    //Getter y Setter
    //Modificar edad
    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        } else {
            System.out.println("\nError Ingresado");
            this.edad = 1;
        }
    }
        
    //Obtener edad
    public int getEdad() {
        return this.edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if (genero == 'm' || genero == 'f') {
            this.genero = genero;
        } else {
            System.out.println("No es valido otro dato F/M");
        }
    }

}//Fin CLASS
