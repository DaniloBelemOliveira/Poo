package PooEstudo.Escola;

import java.util.Date;

public class Aluno {
    private Date dataNascimento;
    private Turma turma;

    public Aluno(){
        this.dataNascimento = null;
        this.turma = null;
    }
    public Aluno(Date dataNascimento,Turma turma){
        this.dataNascimento = dataNascimento;
        this.turma = turma;
    }

    public Date getDataNascimento(){
        return dataNascimento;
    }
    public Turma getTurma(){
        return turma;
    }
    
    public void realizarAvaliacao(){

    }
}
