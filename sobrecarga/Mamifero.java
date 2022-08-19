package com.mycompany.sobrecarga;


public class Mamifero extends Animal { 
    private String corPelo;
    @Override
    public void emitirSom(){
        System.out.println("Som mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}