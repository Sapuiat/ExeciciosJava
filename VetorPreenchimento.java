

package com.mycompany.vetorpreenchimento;

import java.util.Arrays;

public class VetorPreenchimento {

    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 2);
        for (int valor:v) {
            System.out.print(valor+" ");
        }
    }
}
