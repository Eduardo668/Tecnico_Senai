package br.com.senai.model;

import java.util.ArrayList;

public class Funcionario {
    private final ArrayList<String> funcionario = new ArrayList<>();
    private final ArrayList<Double> salario = new ArrayList<>();


    public void setFuncionario() {
        this.funcionario.add("Carlos Silva");
        this.funcionario.add("Ana Marques");
    }

    public void setSalario(){
        this.salario.add(6200.00);
        this.salario.add(2400.00);
    }
    public double media(){
        double media;
        media = (salario.get(0) + salario.get(1)) / 2;
        return media;
    }



    @Override
    public String toString() {
        return "- Funcionário 1 -\n" +
                "Nome: " + funcionario.get(0) + "\nSalário: "+ salario.get(0) +
                "\n-------------------\n- Funcionário 2 -\n" +
                "Nome: "+ funcionario.get(1) + "\nSalário: " + salario.get(1) +
                "\n-------------------\nMédia dos Salários: " + media() +
                "\n-------------------\n-------------------";
    }

}
