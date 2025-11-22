/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jhonw
 */
public class Reglas {

    private int totalCasillas = 68;
    //rojo-amarillo-azul-verde
    private int[] salida = new int[]{38, 4, 21, 55};
    private int[] entrada = new int[]{33, 67, 16, 50};

    //Getter
    public int getTotalCasillas() {
        return totalCasillas;
    }//fin del getter

    public boolean salir(int dado) {
        return dado == 5;
    }//fin del metodo 

    public int salidaId(int colorId) {
        return salida[colorId];
    }//fin del metodo

    //rojo-amarillo-azul-verde
    public boolean entradaWin(int colorId, int indiceRecorrido) {
        return indiceRecorrido == entrada[colorId];
    }//fin del metodo

    //indice = casillas del tablero
    public int avanzar(int indice, int valorDado) {
        //variable para recorrer del indice 
        int i;
        //if para el recorrido 
        if (valorDado > 0) {
            for (i = 0; i < valorDado; i++) {
                indice++;
            }
            if (indice == totalCasillas) {
                indice = 0;
            }//fin del if 
        }//fin del if 
        return indice;
    }//fin del metodo 

    public boolean posicionFichaEntrada(int colorId, int indice, int valorDado) {
        int i;
        if (valorDado > 0) {
            for (i = 1; i <= valorDado; i++) {
                indice++;
                if (valorDado >= totalCasillas) {
                    totalCasillas--;
                }
                if (valorDado == indice) {
                    return true;
                }
            }
        } else {
            if (valorDado < 0) {
                for (i = -1; i >= valorDado; i--) {
                    totalCasillas++;
                }
                if (valorDado < totalCasillas) {
                    totalCasillas++;
                }
                if (valorDado == indice) {
                    return true;
                }
            }
        }
        return false;
    }//fin del metodo
}//fin de la clase 
