/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

import java.util.Random;

/**
 *
 * @author cmu08_12mttuz
 */
public class DronReconocimientoTactico extends SistemaBase {

    private Random numAleatorio = new Random();
    private int[] lecturasTermicas = new int[7];

    public DronReconocimientoTactico(String codigoSerie, int nivelEnergia, boolean estadoVinculacion) {
        super(codigoSerie, nivelEnergia, estadoVinculacion);
    }

    public void generarMapeoEstocastico() {
        System.out.println("Mapeo Estocastico");
        System.out.println("---------------");

        for (int i = 0; i < lecturasTermicas.length; i++) {
            lecturasTermicas[i] = numAleatorio.nextInt(51);
            System.out.printf("Lectura termica %d: %d\n", i + 1, lecturasTermicas[i]);
        }//Fin de FOR

    }//Fin metodo generarMapeoEstocastico

    public void analizarAmenazas() {
        for (int i = 0; i < lecturasTermicas.length; i++) {
            System.out.printf("Analizando cuadrante %d\n", i + 1);
            if (lecturasTermicas[i] > 35) {
                emitirAlertaIncendio();
                break;
            }
        }//Fin de FOR    
    }//Fin metodo analizarAmenazas

    public void emitirAlertaIncendio() {
        System.out.println("ALERTA ROJA! Posible incendio en el sector");
    }//Fin de metodo emitirAlertaIncendio

}//Fin Clase DronReconocimientoTactico
