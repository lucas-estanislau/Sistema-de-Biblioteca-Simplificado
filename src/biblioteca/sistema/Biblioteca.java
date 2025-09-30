package biblioteca.sistema;

import biblioteca.livros.Livro;
import biblioteca.usuarios.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("\n" + usuario.getNome() + " foi cadastrado!\n");
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("\n" + livro.getTitulo() + " foi cadastrado!\n");
    }

    public void novoEmprestimo(int id, Usuario usuario, Livro livro) {
        if(livro.getQuantidade() == 0) {
            System.out.println("\nLivro indisponível no estoque.\n");
        } else {
            Emprestimo emprestimo = new Emprestimo(id, usuario, livro);
            emprestimos.add(emprestimo);
            livro.setQuantidade(livro.getQuantidade() - 1);
            System.out.println("\nEmpréstimo realizado com sucesso!");
            System.out.println("Data prevista: " + emprestimo.getData_prevista() + "\n");
        }
    }

    public void devolucao(Emprestimo emprestimo) {
        emprestimo.getLivro().setQuantidade(emprestimo.getLivro().getQuantidade() + 1);
        emprestimo.setData_devolucao(LocalDate.now());
    }

    public boolean exibirEmprestimos() {
        boolean emprestimoEmAndamento = false;
        System.out.println("Empréstimos em andamento:\n");
        for(Emprestimo emprestimo : emprestimos) {
            if(emprestimo.getData_devolucao() == null) {
                emprestimoEmAndamento = true;
                System.out.println("Empréstimo ID " + emprestimo.getId() + ":\n     Matrícula: " +
                        emprestimo.getUsuario().getMatricula() + " | Livro: " + emprestimo.getLivro().getTitulo()
                        + ", " + emprestimo.getLivro().getAno() + " | Data prevista: " + emprestimo.getData_prevista() +
                        "\n");
            }
        }

        if(!emprestimoEmAndamento) {
            System.out.println("Nenhum empréstimo em andamento.\n");
        }

        return emprestimoEmAndamento;
    }
}
