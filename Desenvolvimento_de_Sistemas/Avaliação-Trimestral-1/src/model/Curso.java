package model;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Turma> turmas = new ArrayList<>();
    private ArrayList<Modulo> modulos = new ArrayList<>();


    public ArrayList<Modulo> getModulos(){
        return modulos;
    }

    public String getNome() {
        return nome;
    }

    public void setTurmas(Turma turma){
        turmas.add(turma);
    }
    public void setModulos(Modulo modulo){
        modulos.add(modulo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", turmas=" + turmas +
                ", modulos=" + getModulos() +
                '}';
    }
}
