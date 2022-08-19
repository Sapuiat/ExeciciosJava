package com.mycompany.ultimoprojetopoo;

public class Gafanhoto extends Pessoa {
    private boolean login;
    private int totAssistido;

    public Gafanhoto(boolean login, String nome, int idade, String sexo, int experiencia) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm(){
        this.totAssistido++;
    }

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + "login=" + login + 
                ", totAssistido=" + totAssistido + super.toString()+'}';
    }
}