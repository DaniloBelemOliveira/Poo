package PooEstudo.Escola;
import java.util.ArrayList;
public class Pessoa {
    private String nome;
    private int matricula;

    public Pessoa(){
        this.nome = null;
        this.matricula = 0;
    }

    public Pessoa(String nome,int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
}
