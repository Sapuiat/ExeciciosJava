package com.mycompany.arvoredeherancas;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga. -50");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void status(){
        System.out.println("Nome do aluno: "+this.getNome());
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Curso: "+this.getCurso());
        System.out.println("");
    }
}