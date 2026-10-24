/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioestudiante;

import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class PromedioEstudiante {

    /**
     * @param args the command line arguments
     * Desarrollar unalgoritmo que permita ingresar
     * 3 notas de un estudiante para calcular el promedio
     * y determinar si aprueba (>70) o no la asignatura.
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        Scanner scan = new Scanner(System.in);   
        
        /*
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double promedio = 0;
        String nombre = "John Doe";
        
        System.out.print("Ingresa la 1ra nota: ");
        nota1 = scan.nextInt();
        
        System.out.print("Ingresa la 2da nota: ");
        nota2 = scan.nextInt();
        
        System.out.print("Ingresa la 3ra nota: ");
        nota3 = scan.nextInt();
        */
        
        Estudiante Carlos = new Estudiante(); 
        Carlos.nota1 = Carlos.IngresoNota(scan, "1ra");
        Carlos.nota2 = Carlos.IngresoNota(scan, "2ra");
        Carlos.nota3 = Carlos.IngresoNota(scan, "3ra");
        Carlos.promedio = Carlos.CalculoPromedio(Carlos.nota1, Carlos.nota2, Carlos.nota3);
        
        Estudiante Rocio = new Estudiante();
        Rocio.nota1 = Rocio.IngresoNota(scan, "1ra");
        Rocio.nota2 = Rocio.IngresoNota(scan, "2ra");
        Rocio.nota3 = Rocio.IngresoNota(scan, "3ra");
        Rocio.promedio = Rocio.CalculoPromedio(Rocio.nota1, Rocio.nota2, Rocio.nota3);
     
        /*
        if (promedio>= 70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }//Fin IF/ELSE
        */
        
        
    }//Fin Main
        
    /*
    public static int IngresoNota(Scanner scan, String numNota){
        int notaTemporal = 0;        
             
        System.out.printf("Ingresa la %s Nota: ", numNota);
        notaTemporal = scan.nextInt();
        
        notaTemporal = ValidarNota(notaTemporal, 0, 100);
        return notaTemporal;
    }//Fin de funcion IngresoNota
    
    public static int ValidarNota(int nota, int limINF, int limSUP){
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
    
    public static double CalculoPromedio (int n1, int n2, int n3){
        double valorTemporal = 0;
        
        valorTemporal = (n1+n2+n3)/3;
        return valorTemporal;    
    }
*/
    
}//Fin Class
