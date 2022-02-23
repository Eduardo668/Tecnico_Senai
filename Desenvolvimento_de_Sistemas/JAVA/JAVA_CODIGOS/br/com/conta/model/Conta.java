package br.com.conta.model;

import java.util.Scanner;

public class Conta {
    private double saldo;
    private double limite;
    private int numero; n        
    public double sacar(double valor){

        if(saldo <= limite){
            System.out.println("");
        }
        saldo -= valor;
        return saldo;
    }

    public void setLimite(double limite){
        this.limite = limite;

    }


}
