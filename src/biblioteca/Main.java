package biblioteca;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciado!");

        Professor p1 = new Professor("Alan", "1010", "BTI", 7);
        System.out.println("Prazo de p1: " + p1.getPrazoDias());

        Aluno a1 = new Aluno("Lucas", "2020", "BTI", 14);
        System.out.println("Prazo de a1: " + a1.getPrazoDias());
    }
}