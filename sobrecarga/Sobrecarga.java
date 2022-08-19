

package com.mycompany.sobrecarga;

public class Sobrecarga {

    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        //c.reagir(true);
        c.reagir(false);
        c.reagir(10, 5.6f);
        
        /*m.emitirSom();
        l.emitirSom();
        c.emitirSom();*/
        
    }
}
