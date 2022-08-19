
package com.mycompany.animais;

public class Animais {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.setCorPelo("Caramelo");
        m.setIdade(2);
        m.setPeso(5.3f);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        Reptil r = new Reptil();
        r.setCorEscama("Verde");
        r.setIdade(3);
        r.setMembros(0);
        r.setPeso(4.3f);
        r.locomover();
        r.alimentar();
        r.emitirSom();
        
        Ave a = new Ave();
        a.setCorPena("Branco");
        a.setIdade(5);
        a.setMembros(2);
        a.setPeso(2.4f);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        
    }
}
