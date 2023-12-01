import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        acervo = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(Livro livro, Usuario usuario) {
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo realizado com sucesso!");
    }

    public void exibirAcervo() {
        System.out.println("=== Acervo da Biblioteca ===");
        for (Livro livro : acervo) {
            livro.exibirDetalhes();
        }
    }
}