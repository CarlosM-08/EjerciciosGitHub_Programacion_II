/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemamonitoreo;

/**
 *
 * @author cmu08_12mttuz
 */
public class SensorAmbiental {
    
    //Atributos
    private String codigoMAC;
    private double temperaturaCelsius;
    private int humedadRelativa;
    private boolean estadoOperativo;

    public SensorAmbiental(String codigo, double tempCel, int humedadRel, boolean estado) {
        this.codigoMAC = codigo;//this se utiliza para apuntar a atributos de la clase
        this.temperaturaCelsius = tempCel;
        this.humedadRelativa = humedadRel;
        this.estadoOperativo = estado;
    }//fin Constructor
    
    //Getter
    public String getCodigoMAC() {
        return this.codigoMAC;
    }

    public double getTemperaturaCelsius() {
        return this.temperaturaCelsius;
    }

    public int getHumedadRelativa() {
        return this.humedadRelativa;
    }
    
    public boolean getEstadoOperativo() {
        return this.estadoOperativo;
    }
    
    //Setter
    public void setTemperatura(double tempC) {
        if (tempC >= -40 && tempC <= 125) {
            this.temperaturaCelsius = tempC;
            System.out.println("Temperatura Actualizada");
        } else {
            System.out.println("Alerta de seguridad");
            System.out.println("Lectura de Temperatura Descartada");
            System.out.println("Fuera de Rango");
        }
    }//Fin Setter setTemeratura

    public void setHumedadRelativa(int hr) {
        if (hr < 0 || hr > 100) {
            this.humedadRelativa = 0;
        } else {
            this.humedadRelativa = hr;
            System.out.println("HR... actualizado");
        }
    }//Fin Setter setHumedadRelativa
    
    public void setCodigoMAC(String codigo) {        
            this.codigoMAC = codigo;       
    }//Fin Setter setCodigoMAC
    
    public void setEstado(boolean estado) {        
            this.estadoOperativo = estado;       
    }//Fin Setter setEstado
    
    public void reporteEstado(){
        System.out.printf("Temperatura: %.2f\n",this.temperaturaCelsius);
        System.out.printf("Humedad Relativa: %d\n",this.humedadRelativa);
        System.out.printf("CodigoMAC: %s\n",this.codigoMAC);
        System.out.printf("Estado: %b\n",this.estadoOperativo);    
    }//Fin Metodo reporteEstado
    
}//Fin de Class
