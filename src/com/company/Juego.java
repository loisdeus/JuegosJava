package com.company;

import java.util.Scanner;

public class Juego {//clase
    public int vidas;//atributo


    public Juego(int vidas) {//constructor
        this.vidas=vidas;//objeto
    }

    public void  MuestraVidasRestantes(){//metodo
        System.out.println("Número de vidas restantes: "+vidas);
    }

    public static void main (String[]args){
        Juego juego1=new Juego(5);//ejecutable también en Main
        juego1.MuestraVidasRestantes();
        juego1.vidas--;
        Juego juego2=new Juego(5);
        juego1.MuestraVidasRestantes();
        juego2.MuestraVidasRestantes();


    }

}
