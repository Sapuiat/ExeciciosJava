

package com.mycompany.vetorbinarysearch;

import java.util.Arrays;


public class VetorBinarySearch {

    public static void main(String[] args) {
        
        int vet[] = {2,8,5,3,6,4,7};
        Arrays.sort(vet);
        for(int valor:vet){
            System.out.println(valor+" ");
        }
        int pos = Arrays.binarySearch(vet, 7);
        System.out.println("Encontrei o valor na posição "+pos);
    }
}
