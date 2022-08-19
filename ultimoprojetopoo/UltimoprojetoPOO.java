package com.mycompany.ultimoprojetopoo;

public class UltimoprojetoPOO {

    public static void main(String[] args) {
        Gafanhoto n[] = new Gafanhoto[2];
        Video v[] = new Video[3];
        
        v[0] = new Video("Aprendendo Java 01");
        v[1] = new Video("Aprendendo HTML");
       
        n[0] = new Gafanhoto(true,"Joao",22,"M",4);
        
        Visualizacao vis[] = new Visualizacao[2]; 
        
        vis[1] = new Visualizacao(n[0],v[0]);
        vis[0] = new Visualizacao (n[0],v[1]);
        vis[0].avaliar(90f);
        vis[1].avaliar();
        System.out.println(v[1].toString());
        System.out.println(v[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[0].toString());
    }
}
