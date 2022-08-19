package com.mycompany.arvoredeherancas;


public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga. -100");
    }
    @Override        
    public void status(){
        System.out.println("Dono da Bolsa: "+this.getNome());
        System.out.println("Matricula: "+this.getMatricula());
        System.out.println("Curso: "+this.getCurso());
    }
    
}