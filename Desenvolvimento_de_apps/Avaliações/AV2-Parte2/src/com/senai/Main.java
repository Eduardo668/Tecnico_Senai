package com.senai;

import com.senai.Model.Imobiliaria;
import com.senai.Model.Residencia;


import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

       ArrayList<Residencia> residencias1 = new ArrayList<>();
        ArrayList<Residencia> residencias2 = new ArrayList<>();

        for (int i = 0; i < 5;i++){
            residencias1.add(new Residencia(random.nextInt(4322), 200000.00 * (i+1), random.nextInt(2123), random.nextInt(300), "88323-"+(i* 100)));
            residencias2.add(new Residencia(random.nextInt(4322),300000.00 * (i+1), random.nextInt(2123), random.nextInt(300), "72451-"+(i* 120) ));

        }

        Imobiliaria imobiliaria = new Imobiliaria("Imoveis São Jose", 1, residencias1, 1, 108,"88323-231");
        System.out.println("LISTA GERAL DE IMOBILIARIAS E SUAS RESCPETIVAS RESIDENCIAS");
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
        System.out.println("Residencias");
        for(Residencia residenciaInfo2 : imobiliaria2.getResidencias()){
            System.out.println(residenciaInfo2);
        }
        System.out.println("\n\n-------------------");

        System.out.println("-------------------");
        System.out.println("LISTA  DE IMOBILIARIAS E SUAS RESCPETIVAS RESIDENCIAS que possuem o preço acima de R$600.000");
        System.out.println("-------------------");
        System.out.println("Imobiliaria 1");
        System.out.println("-------------------");
        System.out.println(imobiliaria);
        System.out.println("Residencias");
        for(Residencia residenciaInfo2 : imobiliaria.getResidencias600mil()){
            System.out.println(residenciaInfo2);
        }
        System.out.println("-------------------\n");
        System.out.println("Imobiliaria 2");
        System.out.println("-------------------");
        System.out.println(imobiliaria2);
        System.out.println("Residencias");
        for(Residencia residenciaInfo3 : imobiliaria2.getResidencias600mil()){
            System.out.println(residenciaInfo3);
        }
        System.out.println("-------------------");


















    }
}
