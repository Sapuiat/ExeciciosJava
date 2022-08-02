

package com.mycompany.diasmeses;

import java.text.SimpleDateFormat;
import java.util.Date;



public class DiasMeses {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        String anoA = year.format(date);
        int anoB = Integer.parseInt(anoA);
        String mes[] = {"Jan","Fev","Mar","Abr","Mai",
            "Jun","Jul","Ago","Set","Out","Nov","Dez"};;
        for (int c=0;c<mes.length;c++){
            if ((anoB==2024)||(anoB==2028)) {
                int tot[] = {31,29,31,30,31,30,31,31,30,31,30,31};
                System.out.println(mes[c]+" tem "+tot[c]+" dias.");
            } else {
                int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
                System.out.println(mes[c]+" tem "+tot[c]+" dias.");
            } 
        } 
    }
}
