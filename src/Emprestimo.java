import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Emprestimo implements Avaliavel {
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private List<AvaliacaoLivro> avaliacoes;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = new Date();
        this.avaliacoes = new ArrayList<>();
    }

    @Override
    public void adicionarAvaliacao(AvaliacaoLivro avaliacao) {
        avaliacoes.add(avaliacao);
    }

    @Override
    public void exibirAvaliacoes() {
        System.out.println("Avaliações para o empréstimo de " + livro.getTitulo() + ":");
        for (AvaliacaoLivro avaliacao : avaliacoes) {
            avaliacao.exibirAvaliacao();
        }
    }
}