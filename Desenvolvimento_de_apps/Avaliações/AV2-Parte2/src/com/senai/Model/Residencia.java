package com.senai.Model;

public class Residencia extends Empreendimento{
    private int id;

   public Residencia(int id, double valor){
       super(valor);
       this.id = id;
   }
    public Residencia(int id, double valor, int idEndereco, int numeroEndereco, String cep){
        super(valor);
        this.id = id;
        setEndereco(idEndereco, numeroEndereco, cep);
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "-----------------"+
                "\nId: " + getId() +
                "\nvalor: R$" + getValor() +
                "\n----------------"+
                "\nEndereco " + getEndereco() +
                "\n----------------";

    }
}
