/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author cmu08_12mttuz
 */
public class MiembroEquipo {
    protected String ligaOrigen;    
    private double salarioMensual;
    private boolean altaMedica;
    private int minutosJugados;
    
    public MiembroEquipo(String ligaOrigen){
    this.ligaOrigen = ligaOrigen;    
    this.altaMedica = false;
    this.minutosJugados = 0;
    }
    
    public void setSalarioMensual(double salarioMensual) {
        
        if(salarioMensual > 0){
            this.salarioMensual = salarioMensual;        
        }
        else{
            System.out.println("Alerta... el contrato es invalido");
        }        
    }
    
    public void iniciarPretemporada(){        
        System.out.println("Iniciando Pretemporada");
        realizarPruebasfisicas();
        this.altaMedica = true;
        System.out.println("Se dio el alta medica");
    }//Fin metodoIniciarPretemporada
    
    private void realizarPruebasfisicas(){
        System.out.println("Realizando las pruebas fisicas");
        String[] fases = new String []{"Resistencia Fisica", "Fuerza", "Velocidad"};
        for (int i = 0; i < 3; i++) {
            System.out.printf("Aprobando Fase %d: %s\n",i+1,fases[i]);            
        }//Fin de For
    }//Fin de Metodo realizar pruebas Fisicas
    
    protected void setSumarMinutos(int cantidad){
    if(cantidad > 0){
        System.out.println("Sumando minutos al jugador");
    this.minutosJugados += cantidad;
    }//Fin de If
    }//Fin de metodo setSumarMinutos
    
}//Fin de Class
