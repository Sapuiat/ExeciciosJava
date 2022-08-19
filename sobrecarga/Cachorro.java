package com.mycompany.sobrecarga;

public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom(){
        System.out.println("Au au au au");
    }
    
    public void reagir(boolean r){
        if (r){
            System.out.println("Abanar");
        } else {
            System.out.println("Latir");
            this.emitirSom();
        }
    }
    
    public void reagir(String frase){
        if (frase.equals("Olá")) {
            System.out.println("Abanar");
        } else if(frase.equals("Toma comida")){
            System.out.println("Abanar e correr");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora,int min){
        
    }
    public void reagir(int idade, float peso){
        if (idade<5){
            if (peso<5) {
                System.out.println("Abanar o rabo");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso>5){
                System.out.println("Rosnar");
            } else {
                System.out.println("Brinca");
            }
        }
    }
}