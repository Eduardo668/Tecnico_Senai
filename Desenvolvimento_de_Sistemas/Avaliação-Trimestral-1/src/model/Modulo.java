package model;

import java.util.ArrayList;

public class Modulo {
    private ArrayList<Aula> aulas = new ArrayList<>();

    public void setAulas(Aula aula){
        aulas.add(aula);
    }

    @Override
    public String toString() {
        return "\nModulo" +
                "\naulas:" + aulas
                ;
    }
}
