

package com.mycompany.javapoo2;

public class JavaPOO2 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
