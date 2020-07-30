package com.company;

import java.util.Scanner;

public abstract class Juego {//clase
    private int vidas;//atributo
    private int vidasIniciales;
    private static int record=0;//común


    public Juego(int vidas) {//constructor
        this.vidas=vidas;//objeto
        this.vidasIniciales=vidas;
    }

    public void  MuestraVidasRestantes(){//metodo
        System.out.println("Número de vidas restantes: "+vidas);
    }

    public boolean QuitaVida(){
        this.vidas--;//variable de método
        if (this.vidas==0) {
            System.out.println("Juego Terminado");
            return false;
        }else{
            return true;
        }
    }

    public void ReiniciaPartida(){
        this.vidas=this.vidasIniciales;
    }

    public void ActualizaRecord(){
        //record;//variable de clase
        if (this.vidas>Juego.record) {
            Juego.record=this.vidas;
            System.out.println("Se ha batido el récord: "+Juego.record);
        }else if(this.vidas==Juego.record){
            System.out.println("Se ha alcanzado el récord");
        }
    }



    }



