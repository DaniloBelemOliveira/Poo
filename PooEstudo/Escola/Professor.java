package PooEstudo.Escola;

public class Professor extends Pessoa{
    private String formacaoAcademica;
    private double salario;
    
    public Professor(){
        this.formacaoAcademica = null;
        this.salario = 0;
    }
    public Professor(String formacaoAcademica, double salario){
        this.formacaoAcademica = formacaoAcademica;
        this.salario = salario;
    }
    public String getFormaçãoAcademica(){
        return formacaoAcademica;
    }
    public double getSalario(){
        return salario;
    }
    public void aplicarAvaliacao(){}
}
