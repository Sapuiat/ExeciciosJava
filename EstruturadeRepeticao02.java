

package com.mycompany.estruturaderepeticao02;

import java.util.Scanner;

public class EstruturadeRepeticao02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resp;
        int s=0, n;
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é "+s);
    }
}
