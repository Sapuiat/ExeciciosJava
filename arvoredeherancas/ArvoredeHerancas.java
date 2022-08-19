

package com.mycompany.arvoredeherancas;


public class ArvoredeHerancas {

    public static void main(String[] args) {
        Bolsista b = new Bolsista();
        Aluno a = new Aluno();
        
        a.setNome("Pedro");
        a.setIdade(30);
        a.setSexo("M");
        a.pagarMensalidade();
        a.setCurso("Informática");
        a.setMatricula(1111);
        a.status();
        
        b.setNome("Joao");
        b.setIdade(24);
        b.setSexo("M");
        b.setBolsa(50);
        b.pagarMensalidade();
        b.setBolsa(100);
        b.setMatricula(2222);
        b.setCurso("Programação Java");
        b.status();
        

    }
}
