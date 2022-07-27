
package com.mycompany.estruturascondicionaiscompostas;

import java.util.Scanner;


public class EstruturasCondicionaisCompostas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        System.out.print("Sua idade é " + idade);
        if (idade>=18) {
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
