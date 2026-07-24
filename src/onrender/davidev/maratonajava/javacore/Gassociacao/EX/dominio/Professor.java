package onrender.davidev.maratonajava.javacore.Gassociacao.EX.dominio;

public class Professor {
     private String nome;
     private String especialidade;
     private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("--------------");
        System.out.println("Nome do professor: " + nome);
        System.out.println("Especialidade do professor: " + especialidade);

        if (seminarios == null || seminarios.length == 0) {
            System.out.println("Nenhum seminário cadastrado.");
            return;
        }
        System.out.println("====Seminarios cadastrados==== ");
        for (Seminario seminario: seminarios) {
            System.out.println("Titulo: " + seminario.getTitulo());

            if (seminario.getLocal() != null) {
                System.out.println("Local do Seminário: " + seminario.getLocal().getEndereco());
            }

            if (seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            System.out.println("====ALUNOS====");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno = " + aluno.getNome() + " , Idade= " + aluno.getIdade());
                
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
