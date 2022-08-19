package com.mycompany.ufc;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String n ,String na ,int i ,float a ,float p ,
            int v ,int d ,int e ){
        this.setNome(n);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setAltura(a);
        this.setPeso(p);
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
    }
    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println("Pesando "+this.getPeso()+" KG");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("é um peso "+this.getCategoria());
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
        System.out.println("");   
                
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public int getIdade (){
        return idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float a){
        this.altura = a;    
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (this.peso<52.2){
            categoria = "Inválido";
        } else if(this.peso <=70.3) {
            categoria = "Leve";
        } else if(this.peso <=83.9){
            categoria = "Médio";
        } else if(this.peso<=120.2){
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int v){
        this.vitorias = v;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}