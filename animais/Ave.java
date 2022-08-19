package com.mycompany.animais;


public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("--------AVE--------");
        System.out.println("Locomoção: Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: Comendo fruta");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som: Som de ave");
        System.out.println("");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public void construirNinho(){
        System.out.println("Ninho feito");
    }
    
}