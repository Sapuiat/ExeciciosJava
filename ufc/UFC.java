
package com.mycompany.ufc;


public class UFC {

    public static void main(String[] args) {
       Lutador l[] = new Lutador[6];
       
       l[0]= new Lutador("John cena","Eua", 45, 1.85f, 114.3f, 50, 14, 2);
       l[1]= new Lutador("UnderTaker","Eua", 57, 2.08f, 120, 80, 16, 0);
       
       l[1].status();
       l[0].status();
      
       Luta ufc = new Luta();
       ufc.marcarLuta(l[0], l[1]);
       ufc.lutar();
       
       l[1].status();
       l[0].status();
    }
}
