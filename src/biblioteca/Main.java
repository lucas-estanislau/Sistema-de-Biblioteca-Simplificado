package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;
        do {
            System.out.println("\n======== MENU ========");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Livro");
            System.out.println("4 - Realizar Empréstimo");
            System.out.println("5 - Realizar Devolução");
            System.out.println("6 - Listar Empréstimos em Andamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1: // cadastrar aluno
                    System.out.print("\n");
                    System.out.print("Matrícula: ");
                    String matricula_aluno = scan.nextLine();
                    System.out.print("Nome: ");
                    String nome_aluno = scan.nextLine();
                    System.out.print("Curso: ");
                    String curso_aluno = scan.nextLine();
                    biblioteca.cadastrarUsuario(new Aluno(nome_aluno, matricula_aluno, curso_aluno));
                    break;

                case 2: // cadastrar professor
                    System.out.print("\n");
                    System.out.print("Matrícula: ");
                    String matricula_professor = scan.nextLine();
                    System.out.print("Nome: ");
                    String nome_professor = scan.nextLine();
                    System.out.print("Curso: ");
                    String curso_professor = scan.nextLine();
                    biblioteca.cadastrarUsuario(new Professor(nome_professor, matricula_professor, curso_professor));
                    break;

                case 3: // cadastrar livro
                    System.out.print("\n");
                    System.out.print("Título: ");
                    String titulo = scan.nextLine();
                    System.out.print("Autor: ");
                    String autor = scan.nextLine();
                    System.out.print("Ano: ");
                    int ano = scan.nextInt();
                    System.out.print("Quantidade: ");
                    int quantidade = scan.nextInt();
                    biblioteca.cadastrarLivro(new Livro(titulo, autor, ano, quantidade));
                    break;

                case 4: // realizar empréstimo
                    System.out.print("\n");
                    System.out.print("Matrícula do usuário: ");
                    String matricula_busca = scan.nextLine();

                    Usuario usuario_encontrado = null;
                    for (Usuario usuario : biblioteca.getUsuarios()) {
                        if (usuario.getMatricula().equals(matricula_busca)) {
                            usuario_encontrado = usuario;
                            break;
                        }
                    }

                    if (usuario_encontrado == null) {
                        System.out.println("Usuário não encontrado.");
                        break;
                    }

                    System.out.print("Título do livro: ");
                    String tituloBusca = scan.nextLine();

                    Livro livro_encontrado = null;
                    for (Livro livro : biblioteca.getLivros()) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                            livro_encontrado = livro;
                            break;
                        }
                    }

                    if (livro_encontrado == null) {
                        System.out.println("Livro não encontrado.");
                        break;
                    }

                    int novo_id = biblioteca.getEmprestimos().size() + 1;
                    biblioteca.novoEmprestimo(novo_id, usuario_encontrado, livro_encontrado);
                    break;

                case 5: // realizar devolução
                    System.out.print("\n");
                    boolean emprestimosEmAndamento = biblioteca.exibirEmprestimos();

                    if (!emprestimosEmAndamento) {
                        break;
                    }

                    System.out.print("\nID do empréstimo a ser devolvido: ");
                    int idDevolvido = scan.nextInt();

                    Emprestimo emprestimo_encontrado = null;
                    for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
                        if (emprestimo.getId() == idDevolvido) {
                            emprestimo_encontrado = emprestimo;
                            break;
                        }
                    }

                    if (emprestimo_encontrado == null) {
                        System.out.println("ID inválido!");
                    } else {
                        biblioteca.devolucao(emprestimo_encontrado);
                    }

                    break;

                case 6: // listar empréstimos em andamento
                    System.out.print("\n");
                    biblioteca.exibirEmprestimos();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scan.close();
    }
}