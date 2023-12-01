public class AvaliacaoLivro {
    private Livro livro;
    private Usuario usuario;
    private int nota;

    public AvaliacaoLivro(Livro livro, Usuario usuario, int nota) {
        this.livro = livro;
        this.usuario = usuario;
        this.nota = nota;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getNota() {
        return nota;
    }

    public void exibirAvaliacao() {
        System.out.println("Avaliação do livro " + livro.getTitulo() + " por " + usuario.getNome() + ": " + nota + " estrelas");
    }

    public void realizarAvaliacao() {
        System.out.println("Avaliação realizada por " + usuario.getNome() + " para o livro " + livro.getTitulo());
    }
}