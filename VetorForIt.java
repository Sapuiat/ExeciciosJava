

package com.mycompany.vetorforit;

import java.util.Arrays;


public class VetorForIt {

    public static void main(String[] args) {
        double v[] = {3.5, 5.74, 9, -4.5};
        Arrays.sort(v);
        for (double valor: v) {
            System.out.println(valor+" ");
        }
    }
}
