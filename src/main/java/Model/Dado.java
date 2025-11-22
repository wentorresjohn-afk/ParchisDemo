/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Random;

/**
 *
 * @author jhonw
 */
public class Dado
{
    //Atributos 
    private Random random;
    private int numero;
    
    //Constructor
    public Dado()
    {
        this.random = new Random();
        this.numero = 0;
    }

    public int getNumero() 
    {
        return numero;
    }

    
    //Metodos
    public int dadosAleatorios()
    {
        numero = random.nextInt(6)+1; //minimo el numero  que lleva el + y el maximo el numero ()
        return numero;
    };
    
   
    
    
}//fin del metodo
