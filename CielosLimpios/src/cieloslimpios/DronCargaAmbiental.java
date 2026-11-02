/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author cmu08_12mttuz
 */
public class DronCargaAmbiental extends SistemaBase {

    private double cargaMaxPer;
    private double cargaAct;

    public DronCargaAmbiental(String codigoSerie, int nivelEnergia, boolean estadoVinculacion, double cargaMaxPer, double cargaAct) {
        super(codigoSerie, nivelEnergia, estadoVinculacion);
        this.cargaMaxPer = cargaMaxPer;
        this.cargaAct = cargaAct;

    }

    public boolean evaluarPesoObjeto(double pesoNuevo) {
        boolean sobrecarga;
        double suma;
        suma = pesoNuevo + this.cargaAct;
        if (suma > cargaMaxPer) {
            sobrecarga = true;
        } else {
            sobrecarga = false;
        }
        return sobrecarga;
    }//fin metodo evaluarPesoObjeto(double pesoNuevo)

    public void engancharDesecho(double pesoNuevo) {
        boolean decision = evaluarPesoObjeto(pesoNuevo);

        if (decision == false) {
            System.out.println("El objeto se puede cargar");
            this.cargaAct += pesoNuevo;
        } else {
            System.out.println("Abortar maniobra!!... El objeto supera el limite permitido");
        }

    }//Fin metodo engancharDesecho

    public void descargarContenedorBase() {
        System.out.println("Llegando a las instalaciones.....");
        System.out.println("Compuertas abiertas");
        System.out.println("Liberando todos los desechos");

        this.cargaAct = 0;

        System.out.printf("Reiniciando carga de manera segura, Carga actual: %.0f\n", this.cargaAct);

    }//Fin metodo descargarContenedorBase

}//Fin clase DronCargaAmbiental
