package com.mycompany.herancapessoas;

public class HerancaPessoas {

    public static void main(String[] args) {
 
        Aluno p1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario();
        
        p1.setNome("Miguenot");
        p1.setIdade(18);
        p1.setSexo("M");
        System.out.println(p1.toString());
        
        p2.setNome("Wagner");
        p2.setIdade(43);
        p2.setSexo("M");
        
        p3.setNome("Ivone");
        p3.setIdade(27);
        p3.setSexo("F");
        
        p1.setCurso("Excel");
        p1.setMatr(true);
        p1.statusA();
        
        p2.setEspecialidade("Professor");
        p2.setSalario(16000);
        p2.receberAum(515.34f);
        p2.status();
        
        
        p3.setSetor("Secretária");
        p3.setTrabalhando(true);
        p3.mudarTrabalho();
        p3.status();
    }
}
