package com.mycompany.javapoo03;

public class Objeto {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    public Objeto(String m, String c,float p) { // Este é o método construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    public String getModelo () {
        return this.modelo; 
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void setTampada (boolean t) {
        this.tampada = t;
    }
    public boolean getTampada () {
        return tampada;
    }
    public void setCor(String c) {
        cor = c;
    }
    public String getCor() {
        return cor;
    }
    public void status() {
        System.out.println("Tampada: " + this.getTampada());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " +this.getPonta());
        System.out.println("Cor: "+this.getCor());
        System.out.println("");
        
    } 
}
    
