package br.com.senai.model;

import br.com.senai.Main;

public class Retangulo {
    private double largura;
    private double altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        double area;
        area = largura * altura;
        return area;
    }

    public double perimetro(){
        double perimetro;
        perimetro = 2* (largura + altura);
        return perimetro;
    }


    public double diagonal(){
        double diagonal;
        diagonal = Math.sqrt(largura*largura + altura*altura);
        return diagonal;
    }

    @Override
    public String toString() {
        return "Entre a largura e altura do retângulo:" +
                "\n--------------------------------"+
                "\nArea: " + area() +
                "\nPerimetro: "+ perimetro() +
                "\nDiagonal: "+ diagonal() +
                "\n--------------------------------";


    }
}
