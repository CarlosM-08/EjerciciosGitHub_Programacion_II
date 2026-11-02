/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * //ARQUITECTURA DEL SISTEMA BASE (CLASE PADRE)
 */
public class SistemaBase {

    private String codigoSerie;
    private int nivelEnergia;
    private boolean estadoVinculacion;

    public SistemaBase(String codigoSerie, int nivelEnergia, boolean estadoVinculacion) {
        this.codigoSerie = codigoSerie;
        this.estadoVinculacion = estadoVinculacion;
        setNivelEnergia(nivelEnergia);
    }// Fin de constructor

    //GETTER y SETTER
    public String getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {

        if (nivelEnergia >= 0 && nivelEnergia <= 100) {
            this.nivelEnergia = nivelEnergia;

            calibrarGiroscopioInterno();

        } else {
            System.out.println("El nivel de Energia debe estar entre 0% y 100%");
        }

    }

    public boolean isEstadoVinculacion() {
        return estadoVinculacion;
    }

    public void setEstadoVinculacion(boolean estadoVinculacion) {
        this.estadoVinculacion = estadoVinculacion;
    }

    private void calibrarGiroscopioInterno() {
        System.out.printf("Calibrando giroscopio del dron %s\n", this.codigoSerie);
        System.out.println("Sensores internos recalibrados correctamente.");

    }//Fin metodo calibrarGiroscopioInterno

    public void transmitirEstadoRed() {
        System.out.println("Telemetria del DRON");
        System.out.println("-------------------");
        System.out.printf("Codigo de serie: %s\n", this.codigoSerie);
        System.out.printf("Nivel de energia: %d\n", this.nivelEnergia);

        if (this.estadoVinculacion == true) {
            System.out.println("Estado de red: En linea\n");
        } else {
            System.out.println("Estado de red: Fuera de linea\n");
        }

    }//Fin metodo transmitirEstadoRed

}//Fin de class
