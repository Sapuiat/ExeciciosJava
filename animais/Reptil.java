package com.mycompany.animais;


public class Reptil extends Animal {
    private String corEscama;
    
    
    @Override
    public void locomover(){
        System.out.println("-----------REPTIL--------");
        System.out.println("Locomoção: Rastejando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som: Som de reptil");
        System.out.println("");
    }
    @Override
    public void alimentar(){
        System.out.println("Alimentação: Comendo inseto");
    }
    public String getCorEscama(){
        return corEscama;
    }
    public void setCorEscama(String c){
        corEscama = c;
    }
}