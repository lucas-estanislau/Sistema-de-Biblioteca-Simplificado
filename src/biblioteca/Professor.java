package biblioteca;

public class Professor extends Usuario {
    protected int prazoDias = 7;

    public Professor(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    int getPrazoDias() {
        return prazoDias;
    }
}
