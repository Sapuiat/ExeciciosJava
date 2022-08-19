package com.mycompany.javapoo2;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status () {
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: "+ this.carga);
        System.out.println("");
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO Não posso escrever"); 
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}


