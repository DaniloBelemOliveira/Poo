package PooEstudo.Escola;

public class Disciplina {
    private String nome ;
    private int cargaHoraria;
    public Disciplina(){
        this.nome = null;
        this.cargaHoraria = 0;
    }
    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public String getNome(){
        return nome;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
}
