package biblioteca;

public class Aluno extends Usuario{
    protected int prazoDias;

    public Aluno(int prazoDias) {
        this.prazoDias = prazoDias;
        System.out.println("O aluno foi criado e ele possui prazo de 14 dias na biblioteca!");
    }

    @Override
    int getPrazoDias() {
        return prazoDias;
    }
}
