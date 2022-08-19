package com.mycompany.contadigital;

import java.util.Scanner;


public class ContaInfo {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private int saldo;
    private boolean status;
    private String corrente="cc";
    private String poupanca="cp";
    protected Scanner teclado = new Scanner(System.in);
    
    public ContaInfo() {
        saldo = 0;
        status = false;
        dono = "Itau";
    }
    public void abrirConta(){
        System.out.println("Qual o tipo da conta? [cc]/[cp]");
        this.tipoConta = teclado.next();
        if (this.tipoConta.equals(corrente)) {
            this.saldo += 50;
        } else if (this.tipoConta.equals(poupanca)){
            this.saldo += 150;
        }
        this.status = true;  
    }
    public void fecharConta () {
        if (this.saldo<0) {
            System.out.println("ERRO! Conta negativa.");
        } else if (this.saldo>0) {
            System.out.println("ERRO! Conta ainda, com saldo.");
        } else if (this.saldo==0) {
            System.out.println("Conta fechada com sucesso.");
            this.status = false;
        }
    }
    public void depositar() {
       if (this.status==true) {
        System.out.println("Quanto deseja depositar? ");
        System.out.println("{1} = 10R$   {2} = 25R$ ");
        System.out.println("{3} = 50R$   {4} = 100R$ ");
        System.out.println("{5} Cancelar");
        int d = teclado.nextInt();
        switch (d) {
            case 1:
                this.saldo += 10;
            case 2:
                this.saldo += 25;
            case 3: 
                this.saldo += 50;
            case 4:
                this.saldo += 100;
            case 5:
                System.out.println("Operação Cancelada");
        }
      } else {
           System.out.println("Abra uma conta antes de realizar esta operação."); 
       }
       
    }
    public void sacar() {
       int saque= 0;
       if (this.status==true) {
        System.out.println("Quanto deseja sacar? ");
        saque = teclado.nextInt();
        } if (saque>this.saldo) {
            System.out.println("Você não tem este valor.");
        } else if ((saque<=this.saldo)&&(saque>=1)) {
            this.saldo -= saque;
        } else if (this.status==false) {
            System.out.println("Abra uma conta antes de realizar esta operação.");
        }
       }

    public void pagarMensal() {
        if (this.tipoConta.equals(corrente)) {
            this.saldo -= 12;
            System.out.println(this.saldo);
        } else if (this.tipoConta.equals(poupanca)) {
            this.saldo -= 20;
            System.out.println(this.saldo);
        } 
        }
    public void status () {
        System.out.println("Conta: "+ this.numConta);
        System.out.println("Tipo Conta: "+ this.tipoConta);
        System.out.println("Dono: "+ this.dono);
        System.out.println("Saldo: "+ this.saldo);
        System.out.println("Status: "+ this.status);
    }
}