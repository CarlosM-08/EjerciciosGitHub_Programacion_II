/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubfutbol;

/**
 *Modelado de un Club de Fútbol con Programación Orientada a Objetos
Estás desarrollando el motor principal para un simulador de gestión deportiva (estilo Football Manager). 
* El objetivo es modelar a los integrantes del club aplicando los pilares de la Programación Orientada a 
* Objetos (POO), garantizando una correcta encapsulación, herencia y control de flujo durante las rutinas 
* de los jugadores.
* 
* Parte 1 MiembroEquipo Crea una clase base llamada MiembroEquipo que cumpla con los siguientes lineamientos: 
* Atributos: 
* Define una liga Origen que tenga visibilidad de paquete/herencia para que pueda ser leída directamente por sus 
* clases hijas sin necesidad de usar getters. 
* Define los atributos salarioMensual altaMedica y minutosJugados con la máxima restricción de acceso . 
* Constructor: Debe recibir la liga de origen por parámetro. Por defecto, el estado de alta médica debe ser false y los minutos jugados 0.
* 
* Encapsulación 
* Crea el método setter para el salarioMensual. Utiliza una condición if/else para validar que el monto ingresado
* sea mayor a 0; si es un valor negativo o cero, muestra un mensaje de alerta indicando que el contrato es inválido. 
* Comportamientos 
* Método de interfaz externa Crea el método iniciarPretemporada(). Este debe cambiar el alta médica a verdadero e 
* invocar obligatoriamente a una rutina médica interna. 
* Rutina de caja negra Crea el método realizar PruebasFisicas(). Utiliza un ciclo for que itere 3 veces simulando 
* las fases de evaluación (ej. Fase 1: Resistencia, Fase 2: Fuerza, Fase 3: Velocidad), imprimiendo el progreso en consola. 
* Método para la familia
* 
* Parte 2 JugadorCampo Crea una clase JugadorCampo que herede de MiembroEquipo:
Atributos propios: Define posicionTactica  y golesMarcados , ambos con acceso estrictamente privado. Genera sus respectivos getters y setters.
Constructor: Debe recibir la liga de origen y la cantidad de goles marcados en el torneo, enviando la liga al constructor de la clase padre.
Método disputarPartido():
Invoca el método heredado para iniciar la pretemporada (habilitando al jugador físicamente).
* 
* Imprime un mensaje en pantalla accediendo directamente al atributo protegido heredado (ej. "Jugador proveniente de: [ligaOrigen] salta a la cancha").
Implementa un ciclo while que inicie en 1 y termine al alcanzar la cantidad total de golesMarcados.
Dentro del ciclo, utiliza una estructura con el operador módulo (%) para narrar los goles. Si el contador actual del gol es impar, imprime "Gol impar anotado de pierna derecha". Si es par, imprime "Gol par anotado de pierna izquierda".
Finaliza el método invocando la función protegida para sumar 90 minutos de juego al expediente del futbolista.
* 
* Parte 3: Clase Principal (Main) Crea la clase ejecutable y realiza las siguientes pruebas de escritorio:
Instancia un objeto JugadorCampo pasándole una liga de origen (ej. "Liga Española") y 4 goles marcados por parámetro al constructor.
Intenta asignarle un salario de -5000 (para verificar que el bloque else de validación de tu setter funciona).
Asígnale un salario válido (ej. 150000.00).
Configura su posición táctica utilizando su setter (ej. "Delantero Centro").
Ejecuta el método disputarPartido() y analiza la secuencia narrativa en la consola para confirmar que la lógica de ciclos y herencia opera correctamente.
 * @author cmu08_12mttuz
 */
public class ClubFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JugadorCampo Daniel = new JugadorCampo("Liga Espanola", 4);
        
        Daniel.setSalarioMensual(-5000);
        System.out.println("");
        
        Daniel.setSalarioMensual(15000);
        
        Daniel.setPosicionTactica("Delantero Estrella Centro!");
        
        Daniel.disputarPartido();
        
        
        
        
        
    }//fin de Main
    
}//Fin de class
