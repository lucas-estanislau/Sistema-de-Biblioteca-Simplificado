package biblioteca;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciado!");

        Professor professor1 = new Professor("Alan", "1010", "BTI", 7);
        System.out.println("Prazo do professor " + professor1.nome + ": " + professor1.getPrazoDias());

        Aluno aluno1 = new Aluno("Lucas", "2020", "BTI", 14);
        System.out.println("Prazo do aluno " + aluno1.nome + ": " + aluno1.getPrazoDias());

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowlling", 2000, 3);

        System.out.println("\nEm estoque: " + livro1.quantidade);

        Emprestimo emprestimo1 = new Emprestimo(123, aluno1, livro1);

        emprestimo1.infoEmprestimo();

        System.out.println("\nEm estoque: " + livro1.quantidade);

    }
}