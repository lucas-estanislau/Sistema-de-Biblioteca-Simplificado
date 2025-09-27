package biblioteca;

public class Professor extends Usuario {
    protected int prazoDias;

    public Professor(String nome, String matricula, String curso, int prazoDias) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.prazoDias = prazoDias;
        System.out.println("O professor " + this.nome + " foi cadastrado com sucesso.");
    }

    @Override
    int getPrazoDias() {
        return 7;
    }
}
