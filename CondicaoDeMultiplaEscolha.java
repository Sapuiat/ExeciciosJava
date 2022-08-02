

package com.mycompany.condicaodemultiplaescolha;

import java.util.Scanner;


public class CondicaoDeMultiplaEscolha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de pernas do animal: ");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "SACI";
                break;
            case 2:
                tipo = "BÍPEDE";
                break;
            case 4:
                tipo = "QUADRÚPEDE";
                break;
            case 6,8:
                tipo = "ARANHA";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
