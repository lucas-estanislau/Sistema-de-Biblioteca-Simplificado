package biblioteca.sistema;

import biblioteca.livros.Livro;
import biblioteca.usuarios.Usuario;

import java.time.LocalDate;

public class Emprestimo {
    private int id;
    protected Usuario usuario;
    private Livro livro;
    private LocalDate data_emprestimo;
    private LocalDate data_prevista;
    private LocalDate data_devolucao;

    public Emprestimo(int id, Usuario usuario, Livro livro) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.data_emprestimo = LocalDate.now();
        this.data_prevista = data_emprestimo.plusDays(usuario.getPrazoDias());
        this.data_devolucao = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDate getData_prevista() {
        return data_prevista;
    }

    public void setData_prevista(LocalDate data_prevista) {
        this.data_prevista = data_prevista;
    }

    public LocalDate getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(LocalDate data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}
