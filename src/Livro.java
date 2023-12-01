import java.util.ArrayList;
import java.util.List;

public class Livro extends Item implements Avaliavel {
    private String autor;
    private List<AvaliacaoLivro> avaliacoes;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
        this.avaliacoes = new ArrayList<>();
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
    }

    @Override
    public void adicionarAvaliacao(AvaliacaoLivro avaliacao) {
        avaliacoes.add(avaliacao);
    }

    @Override
    public void exibirAvaliacoes() {
        System.out.println("Avaliações para o livro " + titulo + ":");
        for (AvaliacaoLivro avaliacao : avaliacoes) {
            avaliacao.exibirAvaliacao();
        }
    }
}