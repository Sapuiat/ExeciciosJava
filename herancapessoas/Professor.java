package com.mycompany.herancapessoas;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAum(float aumento){
        this.salario += aumento;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Especialidade: "+this.getEspecialidade());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("");
    }
}