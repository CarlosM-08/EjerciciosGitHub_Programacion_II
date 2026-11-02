/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cieloslimpios;

import java.lang.classfile.Superclass;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class CielosLimpios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();
        int nivelEnergia;

        DronReconocimientoTactico[] dronReTac = new DronReconocimientoTactico[3];
        DronCargaAmbiental[] dronCaAm = new DronCargaAmbiental[2];

        for (int i = 0; i < 3; i++) {
            System.out.print("\nIngrese codigo de serie del Dron de Reconocimiento: ");
            String codigoSerie = scan.nextLine();

            System.out.print("Esta vinculado? (true/false): ");
            boolean estadoVinculacion = scan.nextBoolean();

            do {
                System.out.print("Ingrese el nivel de energia (0-100): ");
                nivelEnergia = scan.nextInt();

                if (nivelEnergia < 0 || nivelEnergia > 100) {
                    System.out.println("Error: la energia debe estar entre 0 y 100.");
                }

            } while (nivelEnergia < 0 || nivelEnergia > 100);

            scan.nextLine();

            dronReTac[i] = new DronReconocimientoTactico(codigoSerie, nivelEnergia, estadoVinculacion);

        }

        for (int i = 0; i < 2; i++) {
            System.out.print("\nIngrese codigo de serie del Dron de Carga Ambiental: ");
            String codigoSerie = scan.nextLine();

            System.out.print("Esta vinculado? (true/false): ");
            boolean estadoVinculacion = scan.nextBoolean();

            do {
                System.out.print("Ingrese el nivel de energia (0-100): ");
                nivelEnergia = scan.nextInt();

                if (nivelEnergia < 0 || nivelEnergia > 100) {
                    System.out.println("Error: la energia debe estar entre 0 y 100.");
                }

            } while (nivelEnergia < 0 || nivelEnergia > 100);

            System.out.print("Ingrese la carga maxima permitida (kg): ");
            double cargaMaxPer = scan.nextDouble();

            System.out.print("Ingrese la carga actual del dron (kg): ");
            double cargaAct = scan.nextDouble();

            scan.nextLine();

            dronCaAm[i] = new DronCargaAmbiental(codigoSerie, nivelEnergia, estadoVinculacion, cargaMaxPer, cargaAct);

        }

        System.out.println("\nPRIMER CICLO");
        for (int i = 0; i < 3; i++) {
            dronReTac[i].generarMapeoEstocastico();
            dronReTac[i].analizarAmenazas();
            System.out.println("");
        }

        System.out.println("SEGUNDO CICLO");
        for (int i = 0; i < 2; i++) {
            int pesoNuevo = aleatorio.nextInt(100) + 1;
            dronCaAm[i].engancharDesecho(pesoNuevo);
            dronCaAm[i].descargarContenedorBase();
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            int cantidadDesgaste = 20;
            int energiaActual = dronReTac[i].getNivelEnergia();
            int nuevaEnergia = energiaActual - cantidadDesgaste;

            dronReTac[i].setNivelEnergia(nuevaEnergia);

        }

        for (int i = 0; i < 2; i++) {
            int cantidadDesgaste = 20;

            int energiaActual = dronCaAm[i].getNivelEnergia();
            int nuevaEnergia = energiaActual - cantidadDesgaste;

            dronCaAm[i].setNivelEnergia(nuevaEnergia);

        }

        for (int i = 0; i < dronReTac.length; i++) {

            dronReTac[i].transmitirEstadoRed();

        }

        for (int i = 0; i < dronCaAm.length; i++) {

            dronCaAm[i].transmitirEstadoRed();

        }

    }//Fin de main

}//Fin de class
