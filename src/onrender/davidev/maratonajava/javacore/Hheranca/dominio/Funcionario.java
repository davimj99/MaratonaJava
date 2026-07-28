package onrender.davidev.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do Bloco de incialização de Funcionario 1");
    }

    {
        System.out.println("Dentro do Bloco de incialização de Funcionario 2");
    }

    public Funcionario(String nome, String cpf) {
        super(nome);
        super.cpf = cpf;
        System.out.println("Dentro do construtor de Funcionario");
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
