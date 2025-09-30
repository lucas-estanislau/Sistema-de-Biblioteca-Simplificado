package biblioteca.usuarios;

public class Aluno extends Usuario {
    protected int prazoDias = 14;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.prazoDias = prazoDias;
    }

    @Override
    public int getPrazoDias() {
        return prazoDias;
    }
}
