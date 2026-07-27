package onrender.davidev.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf) {
        super(nome);
        super.cpf = cpf;
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatoroPagamento(){
        System.out.println("EU " + this.nome + "Recebi o salário de " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
