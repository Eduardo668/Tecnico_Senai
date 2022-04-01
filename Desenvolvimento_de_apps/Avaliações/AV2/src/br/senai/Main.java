package br.senai;

import br.senai.Model.Imobiliaria;
import br.senai.Model.Residencia;
import java.util.Random;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        ArrayList<Residencia> residencias1 = new ArrayList<>();
        ArrayList<Residencia> residencias2 = new ArrayList<>();
        for (int i = 0; i < 5;i++){
            residencias1.add(new Residencia(random.nextInt(4322),"Rua "+(i+1), 100000.00 * (i+1)));
            residencias2.add(new Residencia(random.nextInt(4322),"Rua Nobre "+(i+1), 300000.00 * (i+1)));

        }

        Imobiliaria imobiliaria = new Imobiliaria("Imoveis José",1,residencias1);
        Imobiliaria imobiliaria2 = new Imobiliaria("Imobiliaria Santos", 2, residencias2);

        System.out.println("-------------------");
        System.out.println("Imobiliaria 1");
        System.out.println("-------------------");
        System.out.println(imobiliaria);
        System.out.println("Residencias");
        for(Residencia residenciaInfo : imobiliaria.getResidencias()){
            System.out.println(residenciaInfo);
        }
        System.out.println("-------------------\n");
        System.out.println("Imobiliaria 2");
        System.out.println("-------------------");
        System.out.println(imobiliaria2);
        for(Residencia residenciaInfo2 : imobiliaria2.getResidencias()){
            System.out.println(residenciaInfo2);
        }
        System.out.println("-------------------");
















    }
}
