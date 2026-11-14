/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoinvernaderoautomatizado;

/**
 *
 * @author cmu08_12mttuz
 */
public abstract class Planta {

    // Atributos de la clase
    private String codRegistro;
    protected String famTaxonomica;
    protected double nivHumedad;
    public String estVital;

    // Constructor
    public Planta(String codRegistro,
            String famTaxonomica,
            double nivHumedad,
            String estVital) {

        this.codRegistro = codRegistro;
        this.famTaxonomica = famTaxonomica;
        this.nivHumedad = nivHumedad;
        this.estVital = estVital;
    }

    // Getter del código de registro
    public String getCodRegistro() {
        return codRegistro;
    }
}//Fin de class Abstract
