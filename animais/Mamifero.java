package com.mycompany.animais;


public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("--------MAMIFERO-------");
        System.out.println("Locomoção: Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Som mamifero");
        System.out.println("");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


}