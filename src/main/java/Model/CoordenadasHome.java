/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jhonw
 */
public class CoordenadasHome 
{
    //todas las casas van a tener un unico arreglo llamado home
    private Coordenadas[] home = new Coordenadas[]
    {
        new Coordenadas(83,70),
        new Coordenadas(392,380),
        new Coordenadas(392,67),
        new Coordenadas(83,377)
    };
//    private Coordenadas[] casa_roja = {new Coordenadas(83,70)};
//    private Coordenadas[] casa_amarilla ={new Coordenadas(392,380)};
//    public Coordenadas[] casa_azul ={new Coordenadas(392,67)};
//    public Coordenadas[] casa_verde ={new Coordenadas(83,377)};
    
    //va a leer el id de los colores para pintar en el tablero las fichas que van a jugar
    public Coordenadas getHome(int colorId )
    {
        if(colorId < 0)
        {
            colorId = 0;
        }
        if (colorId > 3)
        {
            colorId = 3;
        }
        return home[colorId];
    }//fin del metodo
}
