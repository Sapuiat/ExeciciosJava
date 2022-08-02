
package com.mycompany.estruturaderepeticao;


public class EstruturadeRepeticao {

    public static void main(String[] args) {
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 3 || cc == 5) {
                continue;
            }
            if (cc == 8) {
                break;
            }
            System.out.println("Cambalhota "+ cc);
        }
    }
}
