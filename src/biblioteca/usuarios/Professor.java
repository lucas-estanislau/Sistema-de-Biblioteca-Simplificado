package biblioteca.usuarios;

public class Professor extends Usuario {
    protected int prazoDias = 7;

    public Professor(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public int getPrazoDias() {
        return prazoDias;
    }
}
