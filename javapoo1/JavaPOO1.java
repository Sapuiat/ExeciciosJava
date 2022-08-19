

package com.mycompany.javapoo1;

public class JavaPOO1 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.modelo = "Bic";
        c1.destampar();
        c1.rabiscar();
        c1.status();
       
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.modelo = "Bic";
        c2.carga = 50;
        c2.ponta = 2.0f;
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}
