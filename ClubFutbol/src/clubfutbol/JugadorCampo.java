/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author cmu08_12mttuz
 */
public class JugadorCampo extends MiembroEquipo {

    private String posicionTactica;
    private int golesMarcados;

    public JugadorCampo(String ligaOrigen, int goles) {
        super(ligaOrigen);
        this.golesMarcados = goles;
    }//Fin de Constuctor JugadorCampo
    
    //GETTER Y SETTER posicionTactica y golesMarcados
    
     public String getPosicionTactica() {
        return posicionTactica;
    }//Fin get PosicionTactica

    public void setPosicionTactica(String posicionTactica) {
        if(posicionTactica.isBlank()){
        this.posicionTactica = "Sin posicion";
    }
        else{
            this.posicionTactica = posicionTactica;
        }
    }//Fin set posicionTactica

    public int getGolesMarcados() {
        return golesMarcados;
    }//Fin gett GolesMarcados

    public void setGolesMarcados(int golesMarcados) {
        if(golesMarcados < 0){
             this.golesMarcados = 0;
             System.out.println("No pueden haber goles negativos");
        }
        else{
        this.golesMarcados = golesMarcados;
        }
    }//Fin set GolesMarcados

    
    public void disputarPartido() {
        int goles = 0;
        System.out.println("Seleccionado oficial");
        System.out.println("--------------------");
        
        iniciarPretemporada(); 
        
        System.out.printf("Jugador proveniente de: %s, sale a la cancha\n",this.ligaOrigen);
        
        while (goles<this.golesMarcados){
        if(goles %2 ==0){
            System.out.printf("Gol #%d Par anotado de pierna izquierda.\n",goles+1);
        }
        else{
             System.out.printf("Gol #%d Impar anotado de pierna derecha.\n",goles+1);
        }
        goles++;
        }//Fin de ciclo while
        
        System.out.println("Prr......... Fin de Partidos");
        
        setSumarMinutos(90);
        
    }//FIn de metodo disputarPartido
    
    

}//Fin de class Jugador Campo
