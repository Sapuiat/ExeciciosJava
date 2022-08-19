package com.mycompany.controleremoto;

public class ControleCod implements Controlador  {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleCod() {
        this.setVolume(50); 
        this.setLigado(false);
        this.setTocando(false);
    }
    private int getVolume() {
        return volume;
    }
    private void setVolume(int v) {
        volume = v;
    }
    private void setLigado(boolean l) {
        ligado = l;
    }
    private boolean getLigado() {
        return ligado;
    }
    private boolean getTocando (){
        return tocando;
    }
    private void setTocando(boolean t){
        tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);  
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------MENU----------");
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando? "+ this.getTocando());
        System.out.println("Volume: "+this.getVolume());
        for (int i= 0; i< this.getVolume(); i+=10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()+5);
        } else {
            System.out.println("Impossivel aumentar volume");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume()-5);
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()&&this.getVolume()>0) {
            this.setVolume(0);
        } else {
            System.out.println("Impossivel colocar no mudo");
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado()&& this.getVolume()==0) {
            this.setVolume(50);
        } else {
            System.out.println("Impossivel retirar o mudo");
        }
    }

    @Override
    public void play() {
        if (this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        } 
    }

    @Override
    public void pause() {
       if (this.getLigado()&& this.getTocando()) {
           this.setTocando(false);
       }
    }
}