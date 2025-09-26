package biblioteca;

public class Professor extends Usuario {
    protected int prazoDias;

    public Professor(int prazoDias) {
        this.prazoDias = prazoDias;
        System.out.println("O professor foi criado e ele possui prazo de 7 dias na biblioteca!");

    }

    @Override
    int getPrazoDias() {
        return prazoDias;
    }
}
