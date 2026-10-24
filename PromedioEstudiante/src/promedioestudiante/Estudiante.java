/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedioestudiante;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class Estudiante {

    //Variables - Instancias
    int nota1 = 0;
    int nota2 = 0;
    int nota3 = 0;
    double promedio = 0;
    String nombre = "John Doe";

    public Estudiante() {

    }
    
    public int IngresoNota(Scanner scan, String numNota){
        int notaTemporal = 0;        
             
        System.out.printf("Ingresa la %s Nota: ", numNota);
        notaTemporal = scan.nextInt();
        
        notaTemporal = ValidarNota(notaTemporal, 0, 100);
        
        return notaTemporal;
    }//Fin de funcion IngresoNota
    
    public int ValidarNota(int nota, int limINF, int limSUP){
        Scanner scan = new Scanner(System.in);
        
        do{
            if(nota<limINF || nota > limSUP){
                System.out.println("Nota fuera de Rango");
                System.out.printf("Limites son %d - %d\n",limINF,limSUP);
                System.out.println("Ingrese nuevemente la nota");
                System.out.print("Nota: ");
            nota = scan.nextInt();
            }//Fin IF
        }while(nota<limINF || nota > limSUP);
        return nota;     
    }//Fin funcion ValidadNota
    
    public double CalculoPromedio (int n1, int n2, int n3){
        double valorTemporal = 0;
        
        valorTemporal = (n1+n2+n3)/3;
        return valorTemporal;    
    }
    

}//Fin class Estrudiante
