/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaplantacontrolensambladora;

/**
 *
 * @author cmu08_12mttuz
 */
public class BrazoRobotico extends EquipoIndustriales implements ICalibracion {

    private String tipoSoldadura;

    public BrazoRobotico(String numeroSerie, String tipoSoldadura) {
        this.tipoSoldadura = tipoSoldadura;
        super(numeroSerie);
    }

    public String getSoldadura(){
        return this.tipoSoldadura;            
    }

    @Override
    public void procesarMaterial() {
        System.out.print("Esta Maquina opera con la soldadura: ");
        System.out.println(""+getSoldadura());
    }
    
    @Override
    public void iniciarCalibracion() {
        System.out.println("Inicio de Calibracion de brazo");
        System.out.printf("Numero de serie: %s\n",this.numeroSerie);
    }
    
    @Override
    public void terminarCalibracion() {
        System.out.println("Calibracion con exito");
    }
    
    @Override
    public boolean obtenerEstadoCalibracion() {
        return this.estadoOperativo;
    }
}
    
    
    

