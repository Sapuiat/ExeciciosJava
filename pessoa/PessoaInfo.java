package com.mycompany.pessoa;


public class PessoaInfo {
    
    private String nome;
    private int idade;
    private String sexo;

    public PessoaInfo(String nome,int idade,String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String n){
        nome = n;
    } 
    public int getIdade(){
        return idade;
    }        
    public void setIdade(int i){
        idade = i;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String s){
        sexo = s;
    }
}