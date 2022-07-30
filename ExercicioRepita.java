
package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int n, s = 0 , val= 0 ,par = 0,imp = 0,aci = 0,med=0;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número:<br><em>(Valor 0 interrompe)<br></em></html>"));
        if (n>=1) {
         val++;
        }
        if (n % 2 == 0){
            par++;
        } else {
            imp++;
        } 
        if (n>100) {
            aci++;
        }
        s += n;
        } while (n != 0);
        med = s/val;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr> " +
                "<br>Total de valores: <br>"+ val + 
                "<br>Total de pares: <br>"+ par +
                "<br>Total de impares: <br>" + imp +
                "<br>Acima de 100: <br>" +aci+ 
                "<br>Média dos valores: <br>"+med+ "</html>");
    }   
}
