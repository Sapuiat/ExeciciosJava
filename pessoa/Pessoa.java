package com.mycompany.pessoa;


public class Pessoa {

    public static void main(String[] args) {
        PessoaInfo[] p = new PessoaInfo[2];
        Livro[] l = new Livro[2];
        
        p[0] = new PessoaInfo("Joao",28,"Masculino");
        p[1] = new PessoaInfo("Enzo",15,"Masculino");
        
        l[0] = new Livro("O nome do vento","Patick Rothfuss",656,p[0]);
        l[1] = new Livro("Harry Potter","J. K. Rowling",208,p[1]);
        
        l[0].abrir();
        l[0].folhear(56);
        l[0].voltarPag();
        l[0].detalhes();
        
        l[1].abrir();
        l[1].folhear(212);
        l[1].detalhes();
    }
}
