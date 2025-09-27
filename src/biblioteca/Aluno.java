package biblioteca;

public class Aluno extends Usuario{
    protected int prazoDias;

    public Aluno(String nome, String matricula, String curso, int prazoDias) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.prazoDias = prazoDias;
        System.out.println("O aluno " + this.nome + " foi cadastrado com sucesso.");
    }

    @Override
    int getPrazoDias() {
        return 14;
    }
}
