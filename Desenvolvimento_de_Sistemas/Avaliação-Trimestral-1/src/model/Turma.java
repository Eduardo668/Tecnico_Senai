package model;

import java.util.ArrayList;
import java.util.Date;

public class Turma {
    private Long id;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private String ano_da_turma;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAno_da_turma() {
        return ano_da_turma;
    }

    public void setAno_da_turma(String ano_da_turma) {
        this.ano_da_turma = ano_da_turma;
    }

}
