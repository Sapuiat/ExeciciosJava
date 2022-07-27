
package com.mycompany.linguagem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;


public class Linguagem {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        String lin = loc.getDisplayLanguage();
        System.out.println("O idioma do sistema é " + lin);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    }
}
