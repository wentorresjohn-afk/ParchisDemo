/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jhonw
 */
public class TableroCoordenadas 
{
    private Coordenadas [] recorrido = new Coordenadas[]
    {
        //coordenadas
        // new Coordenadas (100, 100,//1     
        
    };
    private int salida_amarillo = 5;
    private int salida_azul = 22;
    private int salida_rojo = 39;
    private int salida_verde = 56;
    
    public Coordenadas getPosicion(int indice)
    {
        return recorrido[indice];
    };
    
    public int getCasillaTotal()
    {
        return recorrido.length;
    };
}
