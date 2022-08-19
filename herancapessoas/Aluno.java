package com.mycompany.herancapessoas;

public class Aluno extends Pessoa{
    private boolean matr;
    private String curso;
    
    
    public void cancelarMatr(){
        this.setMatr(false);
        System.out.println("Matricula cancelada.");
    }
    
    
    public boolean getMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void statusA(){
        System.out.println("Matr: "+this.getMatr());
        System.out.println("Curso: "+this.getCurso());
        System.out.println("");
    }
    
}