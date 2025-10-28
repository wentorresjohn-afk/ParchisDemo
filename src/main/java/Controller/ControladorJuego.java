/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;
import View.*;
import java.util.Random;
/**
 *
 * @author jhonw
 */
public class ControladorJuego implements ActionListener
{
    //atributos tipo objeto
    private GUIJuego gui;
    private PanelControl panelControl;
    private PanelTablero panelTablero;
    
    //clases de coordenadas
    private TableroCoordenadas tablero;
    private CoordenadasHome home;
    
    //atributos de tipo objeto (clase Ficha)
    private Ficha jugador;
    private Ficha oponente;
    
    //identifican el color de las fichas de ambos jugadores
    private int colorJugadorId;
    private int colorOponenteId;
    
    private Random random = new Random();
    private Dado dado = new Dado(random,0);
    private Colores colores = new Colores();

    public ControladorJuego(PanelControl panelControl, PanelTablero panelTablero, int pColorJugadorId) {
        this.panelControl = panelControl;
        this.panelTablero = panelTablero;
        this.colorJugadorId = colorJugadorId;
        
        tablero = new TableroCoordenadas();
        home = new CoordenadasHome();
        
        //identifica lo sid de los colores que se seleccionaron
        //rojo=0, amarillo=1, azul=2 y verde=3
        colorJugadorId = pColorJugadorId;
        if (colorJugadorId < 0)
        {
            colorJugadorId = 0;
        }if (colorJugadorId > 3)
        {
            colorJugadorId = 3;
        }
        
        //parejas (rojo y amarillo) , (azul y ver)
        if (colorJugadorId == 0)
        {
            colorOponenteId = 1;
        }else if(colorJugadorId == 1)
        {
            colorOponenteId = 0;
        }else if (colorJugadorId == 2 )
        {
            colorOponenteId = 3;
        }else if (colorJugadorId == 3)
        {
            colorOponenteId = 2;
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
}
