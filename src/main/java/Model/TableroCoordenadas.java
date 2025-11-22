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
    private int indice = 0;
    
    private Coordenadas [] recorrido = new Coordenadas[]
    {
        //coordenadas
        // new Coordenadas (100, 100,//1   
        
        
        new Coordenadas (292,443),//1 = indice 0
        new Coordenadas (292,423),//2 = indice 1
        new Coordenadas (292,401),//3 = indice 2
        new Coordenadas (292,377),//4 = indice 3
        new Coordenadas (292,355),//5 = indice --4
        new Coordenadas (292,333),//6
        new Coordenadas (292,311),//7
        new Coordenadas (292,291),//8
        new Coordenadas (304,275),//9
        new Coordenadas (327,275),//10
        new Coordenadas (348,275),//11
        new Coordenadas (371,275),//12
        new Coordenadas (394,275),//13
        new Coordenadas (416,275),//14
        new Coordenadas (439,275),//15
        new Coordenadas (461,275),//16
        new Coordenadas (461,223),//17
        new Coordenadas (461,173),//18
        new Coordenadas (439,173),//19
        new Coordenadas (416,173),//20    
        new Coordenadas (394,173),//21
        new Coordenadas (372,173),//22
        new Coordenadas (349,173),//23
        new Coordenadas (328,173),//24
        new Coordenadas (303,173),//25
        new Coordenadas (292,155),//26
        new Coordenadas (292,135),//27
        new Coordenadas (292,114),//28
        new Coordenadas (292,93),//29
        new Coordenadas (292,69),//30
        new Coordenadas (292,46),//31
        new Coordenadas (292,23),//32  
        new Coordenadas (292,3),//33
        new Coordenadas (241,3),//34
        new Coordenadas (187,3),//35
        new Coordenadas (187,25),//36
        new Coordenadas (187,47),//37 
        new Coordenadas (187,69),//38 
        new Coordenadas (187,91),//39 
        new Coordenadas (187,113),//40   
        new Coordenadas (187,135),//41 
        new Coordenadas (187,157),//42
        new Coordenadas (174,174),//43
        new Coordenadas (151,174),//44
        new Coordenadas (130,174),//45 
        new Coordenadas (106,174),//46
        new Coordenadas (84,174),//47
        new Coordenadas (62,174),//48
        new Coordenadas (40,174),//49 
        new Coordenadas (18,174),//50
        new Coordenadas (18,222),//51
        new Coordenadas (18,275),//52
        new Coordenadas (40,275),//53
        new Coordenadas (61,275),//54
        new Coordenadas (84,275),//55
        new Coordenadas (106,275),//56
        new Coordenadas (129,275),//57
        new Coordenadas (152,275),//58
        new Coordenadas (174,275),//59
        new Coordenadas (187,291),//60
        new Coordenadas (187,289),//61
        new Coordenadas (187,332),//62
        new Coordenadas (187,356),//63
        new Coordenadas (187,381),//64
        new Coordenadas (187,401),//65
        new Coordenadas (187,425),//66
        new Coordenadas (187,443),//67
        new Coordenadas (235,443),//68
      
    };
    
    private int salida_amarillo = 5;
    private int salida_azul = 22;
    private int salida_rojo = 39;
    private int salida_verde = 56;
    
    private Coordenadas [][] caminoWin = new Coordenadas[][]
    {
        //Rojo
        {
             new Coordenadas (239,23),//0
             new Coordenadas (239,45),//1
             new Coordenadas (239,67),//2
             new Coordenadas (239,91),//3
             new Coordenadas (239,115),//4
             new Coordenadas (239,136),//5
             new Coordenadas (239,160),//6       
        },
            
        //Amarillo
        {
             new Coordenadas (239,424),//0
             new Coordenadas (239,401),//1
             new Coordenadas (239,379),//2
             new Coordenadas (239,355),//3
             new Coordenadas (239,332),//4
             new Coordenadas (239,311),//5
             new Coordenadas (239,287),//6
        },
        
        //Azul
        {
             new Coordenadas (429,222),//0
             new Coordenadas (416,222),//1
             new Coordenadas (394,222),//2
             new Coordenadas (371,222),//3
             new Coordenadas (349,222),//4
             new Coordenadas (327,222),//5
             new Coordenadas (302,222),//6
        },
        
        //Verde
        {
             new Coordenadas (38,222),//0
             new Coordenadas (62,222),//1
             new Coordenadas (84,222),//2
             new Coordenadas (106,222),//3
             new Coordenadas (129,222),//4
             new Coordenadas (151,222),//5
             new Coordenadas (176,222),//6
        },
    };
    
    private Coordenadas[] metas = new Coordenadas[]
    {
        new Coordenadas(239, 193), //1
        new Coordenadas(239, 257), //2
        new Coordenadas(269, 222), //3
        new Coordenadas(209, 222), //4
    };
         
    //Método obtener las posiciones
    public Coordenadas getPosicion(int indiceGeneral) {
        return recorrido[indiceGeneral];
    }//fin del metodo

    //Método para obtenner las casillas
    public int getCasillas() {
        return recorrido.length;
    }//fin del metodo

    //Lee el tamaño y avanza según caminoWin
    public int getAvanzarFicha(int colorId) {
        return caminoWin[colorId].length;
    }//fin del metodo

    //Método para caminar o avanzar en el camino a win de cada color
    public Coordenadas getCaminoWin(int colorId, int step) {
        return caminoWin[colorId][step];
    }//fin del metodo
    
    //metodo meta segun el color de la ficha 
    public Coordenadas getMetas(int colorId){
        return metas[colorId];   
    }//fin del metodo

}//fin del arrelgo y metodos
