package com.company;

public class Aplicacion {

    public static void main(String[] args) {
	// write your code here
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(5,7);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar juego3= new JuegoAdivinaImpar(3,5);
        juego.MuestraNombre();
        juego.MuestraInfo();
        juego.Juega();
        juego2.MuestraNombre();
        juego2.MuestraInfo();
        juego2.Juega();
        juego3.MuestraNombre();
        juego3.MuestraInfo();
        juego3.Juega();


        //Juego juego1=new Juego(5);
        //juego1.ActualizaRecord();
        //Juego juego2=new Juego(5);
        //juego1.QuitaVida();
        //juego1.ActualizaRecord();
        //juego1.MuestraVidasRestantes();
        //juego1.ReiniciaPartida();
        //juego1.MuestraVidasRestantes();
        //juego1.ActualizaRecord();




        //Juego juego1=new Juego(5);//ejecutable también en Main
        //juego1.MuestraVidasRestantes();
        //juego1.vidas--;
        //Juego juego2=new Juego(5);
        //juego1.MuestraVidasRestantes();
        //juego2.MuestraVidasRestantes();
    }
}
