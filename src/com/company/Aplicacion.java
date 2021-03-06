package com.company;

import com.company.Interface.Jugable;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
	// write your code here
        Scanner leer=new Scanner(System.in);
        String seguir;
        do {
            Jugable juego=EligeJuego();
            juego.MuestraNombre();
            juego.MuestraInfo();
            juego.Juega();
            System.out.println("Seguir jugando s/n \n");
            seguir=leer.nextLine();
        }while (seguir.equals("s"));

        //JuegoAdivinaNumero juego=new JuegoAdivinaNumero(5,7);
        //JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,4);
        //JuegoAdivinaImpar juego3= new JuegoAdivinaImpar(3,5);
        //juego.MuestraNombre();
        //juego.MuestraInfo();
        //juego.Juega();
        //juego2.MuestraNombre();
        //juego2.MuestraInfo();
        //juego2.Juega();
        //juego3.MuestraNombre();
        //juego3.MuestraInfo();
        //juego3.Juega();


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
    public static Jugable EligeJuego(){
        JuegoAdivinaNumero juego1=new JuegoAdivinaNumero(5,7);
        JuegoAdivinaPar juego2=new JuegoAdivinaPar(3,4);
        JuegoAdivinaImpar juego3= new JuegoAdivinaImpar(3,5);
        Jugable[]juegos=new Jugable[3];
        juegos[0]=juego1;
        juegos[1]=juego2;
        juegos[2]=juego3;
        Scanner leer=new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Selecciona un juego\n" +
                    "0 . Juego Adivina un número\n" +
                    "1 . Juego Adivina un número par\n" +
                    "2 . Juego Adivina un número impar\n");

            opcion=leer.nextInt();
            leer.nextLine();

        }while (!(opcion<=2) & (opcion>=0));
        return juegos[opcion];
    }
}
