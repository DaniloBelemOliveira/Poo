package PooEstudo.Escola;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private int ano;
    private ArrayList<Aluno> alunosTurma ;
    private ArrayList<Disciplina> disciplinasTurma;
    private ArrayList<Professor> professoresTurma;
    
    public String getNome() {
        return nome;
    }
    public int getAno() {
        return ano;
    }

    public ArrayList<Aluno> getalunosTurma() {
        return alunosTurma;
    }
    public ArrayList<Professor> getTurmaProfessores() {
        return turmaProfessores;
    }
    public ArrayList<Disciplina> getalunosDisciplinas() {
        return alunosDisciplinas;
    }

    public void setalunosTurma(Aluno aluno) {
        this.alunosTurma.add(aluno);
    }
    public void setTurmaProfessores(Professor professor) {
        this.turmaProfessores.add(professor);
    }
    public void setalunosDisciplinas(Disciplina disciplina) {
        this.alunosDisciplinas.add(disciplina);
    }

    public Turma(){
        this.nome = null;
        this.ano = -1;
        this.alunosTurma = null;
        this.turmaProfessores = null;
        this.alunosDisciplinas = null;
    }
    public Turma(String nome,int ano){
        this.nome = nome;
        this.ano = ano;
        this.alunosTurma = null;
        this.turmaProfessores = null;
        this.alunosDisciplinas = null;
    }
}
