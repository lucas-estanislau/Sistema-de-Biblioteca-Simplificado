package biblioteca;

public class Emprestimo {
    private int id;
    private Usuario usuario;
    private Livro livro;
    //colocar as datas (emprestimo, prevista e de devolução

    public Emprestimo(int id, Usuario usuario, Livro livro) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;

        livro.quantidade = livro.quantidade - 1; // removendo um livro do estoque por causa do empréstimo
    }

    public void infoEmprestimo() {
        System.out.println("\n");
        System.out.println("ID: " + id);
        System.out.println("Matrícula: " + usuario.matricula);
        System.out.println("Livro: " + livro.titulo + ", " + livro.autor + ", " + livro.ano);
    }
}
