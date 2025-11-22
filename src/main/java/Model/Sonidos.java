/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author jhonw
 */
public class Sonidos 
{
    private Clip musica;

    private Clip cargar(String ruta) 
    {
        try 
        {
            URL u = getClass().getResource(ruta);
            if (u == null) 
            {
                System.err.println("No se encontró el recurso: " + ruta);
                return null;
            }
            AudioInputStream ais = AudioSystem.getAudioInputStream(u);
            Clip c = AudioSystem.getClip();
            c.open(ais);
            return c;
        } catch (UnsupportedAudioFileException e) 
        {
            System.err.println("Formato de audio no soportado: " + ruta);
            e.printStackTrace();
            return null;
        } catch (IOException e) 
        {
            System.err.println("Error de entrada/salida al cargar: " + ruta);
            e.printStackTrace();
            return null;
        } catch (Exception e) 
        {
            System.err.println("Error general al cargar sonido: " + ruta);
            e.printStackTrace();
            return null;
        }
    }

    public void musicaFondo() {
        musica = cargar("/sonidos/Principal.wav");
        if (musica != null) {
            musica.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void detenerFondo() {
        if (musica != null) {
            musica.stop();
            musica.close();
            musica = null;
        }
    }

    public void click() 
    {
        Clip c = cargar("/sonidos/click.wav");
        if (c != null) 
        {
            c.start();
        }
    }

    public void gana() 
    {
        Clip c = cargar("/sonidos/gana.wav");
        if (c != null)
        {
            c.start();
        }
    }

    public void pierde() 
    {
        Clip c = cargar("/sonidos/pierde.wav");
        if (c != null) 
        {
            c.start();
        }
    }
}