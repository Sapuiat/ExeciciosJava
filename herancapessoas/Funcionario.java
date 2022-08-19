package com.mycompany.herancapessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Trabalhando: "+this.getTrabalhando());
        System.out.println("Setor: "+this.getSetor());
    }
}