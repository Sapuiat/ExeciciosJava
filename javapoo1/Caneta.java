package com.mycompany.javapoo1;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status () {
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: "+ this.carga);
        System.out.println("");
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO Não posso escrever"); 
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}


