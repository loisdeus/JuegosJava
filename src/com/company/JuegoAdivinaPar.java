package com.company;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{
    public JuegoAdivinaPar(int vidas, int numero) {
        super(vidas, numero);
    }

    @Override
    public boolean ValidaNumero(int num) {
        if (num%2==0){
            return true;
        }else{
            System.out.println("Error");
            return false;
        }
       // return super.ValidaNumero(num);
    }
    public  void  MuestraNombre(){
        System.out.println("Juego Adivina Numero solo Par");
    }

        public void MuestraInfo(){
            System.out.println("Tienes que adivinar el número antes de quedarte sin vidas");
            this.MuestraVidasRestantes();
        }

    }

