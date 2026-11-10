/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaplantacontrolensambladora;

/**
 *
 * @author cmu08_12mttuz
 */
public abstract class EquipoIndustriales { //la classe abstracta es algo que no se puede instanciar sirve como base para construir lo que se desea

    public String numeroSerie;
    public boolean estadoOperativo;
    protected int horasUso;
    protected double capacidadCarga;

    public EquipoIndustriales(String numeroSerie) {
        this.numeroSerie = numeroSerie;          
    }// Fin de Constructor
    
    
    //GETTER Y SETTER   

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

       
    //METODOS    
    public void encender(){}
    public void apagar(){}
    public abstract void procesarMaterial();

}//Fin de abstract Class



