package biblioteca;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int ano;
    protected int quantidade;

    public Livro(String titulo, String autor, int ano, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
    }
}
