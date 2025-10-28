/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jhonw
 */
public class Ficha 
{
    private int salida;
    private int totalSalidas;
    private boolean posicionInicial;
    private int indice = -1;
    private String color;
    private boolean poseInicial = true;

    public Ficha(int salida, int totalSalidas, String color)
    {
        this.salida = salida;
        this.totalSalidas = totalSalidas;
        this.color = color;
    }//fin del constructor

    public String getColor() 
    {
        return color;
    }//fin del get
    
    public boolean posicionInicial()
    { 
        return posicionInicial;
    }
    
    public boolean estaEnCasa()
    {
        return posicionInicial;
    }
    
    public int getIndice()
    {
        return indice;
    }
}
