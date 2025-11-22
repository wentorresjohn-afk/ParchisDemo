/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author jhonw
 */
public class Preguntas 
{
    private Random random = new Random();
    
    private String[][] facil = {
        {"System.out.println(´´texto´´) imprime en pantalla?", "V"},
        {"¿El Sol es una estrella?", "V"},
        {"¿París es la capital de Italia?", "F"},
        {"¿El agua hierve a 100°C al nivel del mar?", "V"},
        {"¿El tiburón es un mamífero?", "F"},
        {"¿El cuerpo humano tiene 206 huesos?", "V"},
        {"¿La ballena azul es el animal más grande del planeta?", "V"},
        {"¿África es el continente más pequeño del mundo?", "F"},
        {"¿Marte es el planeta más cercano al Sol?", "F"},
        {"¿Los seres humanos tienen cinco sentidos?", "V"},
        {"¿La Gran Muralla China está en Asia?", "V"}
    };
    
    private String[][] medio = {
        {"System.out.println(´´texto´´) imprime en pantalla?", "V"},
        {"¿La fotosíntesis es el proceso por el cual las plantas producen su propio alimento?", "V"},
        {"¿La Antártida es el continente más poblado del mundo?", "F"},
        {"¿La física estudia la materia, la energía y sus interacciones?", "V"},
        {"¿El hinduismo es la religión con más seguidores en el mundo?", "F"},
        {"¿Japón está compuesto por más de 3.000 islas?", "V"},
        {"¿El río Nilo atraviesa exclusivamente un solo país?", "F"},
        {"¿La ONU fue fundada después de la Segunda Guerra Mundial?", "V"},
        {"¿La capa de ozono se encuentra en la troposfera?", "F"},
        {"¿La península ibérica está formada por España, Portugal y Francia?", "F"},
        {"¿El Monte Kilimanjaro se encuentra en Tanzania?", "V"}
    };
   
    private String[][] dificil = {
        {"System.out.println(´´texto´´) imprime en pantalla?", "V"},
        {"¿La capital de Canadá es Ottawa y no Toronto?", "V"},
        {"¿El océano Índico es el más grande del mundo?", "F"},
        {"¿El Monte Everest se encuentra en la cordillera del Himalaya?", "V"},
        {"¿Machu Picchu fue construido por la civilización maya?", "F"},
        {"¿El desierto del Sahara es el desierto cálido más grande del mundo?", "V"},
        {"¿La moneda oficial de Suiza es el euro?", "F"},
        {"¿El idioma oficial de Brasil es el portugués?", "V"},
        {"¿El río Amazonas pasa por más de dos países?", "V"},
        {"¿Australia es considerada tanto un país como un continente?", "V"},
        {"¿La muralla más larga del mundo después de la Gran Muralla China está en Alemania?", "F"}
    };
    
    
      public boolean preguntaVF(int dificultad) {
        String[][] banco;
        if (dificultad == 1) {
            banco = facil;
        } else if (dificultad == 2) {
            banco = medio;
        } else {
            banco = dificil;
        }

        int indice = random.nextInt(banco.length);
        String pregunta = banco[indice][0];
        String respuesta = banco[indice][1];

        String titulo = "Pregunta";

        int opcion = JOptionPane.showConfirmDialog(null, pregunta + "\nSeleccione: Sí = Verdadero, No = Falso",
                titulo, JOptionPane.YES_NO_OPTION);

        String respuestaJugador = (opcion == JOptionPane.YES_OPTION) ? "V" : "F";
        boolean correcta = respuestaJugador.equals(respuesta);

        String mensaje;
        if (correcta) {
            if (dificultad == 1) {
                mensaje = "Correcto, ganaste 1 punto";
            } else {
                mensaje = "Correcto, ganaste 2 puntos";
            }
        } else {
            if (dificultad == 1) {
                mensaje = "Incorrecto, perdiste 1 punto";
            } else {
                mensaje = "Incorrecto, perdiste 2 puntos";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
        return correcta;
    }

    public void iniciarJuego() {
        int totalPreguntas = 20;
        for (int i = 0; i < totalPreguntas; i++) {
            int dificultad = random.nextInt(3) + 1; // 1 = fácil, 2 = media, 3 = difícil
            preguntaVF(dificultad);
        }
    }
}
