package com.company;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean ValidaNumero(int num) {
        if (num%2==0){
            System.out.println("Error");
            return false;
        }else{
            return true;
        }
        //return super.ValidaNumero(num);
    }
    public void MuestraNombre(){
        System.out.println("Juego Adivina Número solo Impar");
    }
    public void MuestraInfo(){
        System.out.println("Tienes que adivinar el número antes de quedarte sin vidas");
        this.MuestraVidasRestantes();
    }
}
