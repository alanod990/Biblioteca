public class Usuario extends Pessoa {
    public Usuario(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Usuário: " + nome + " | Idade: " + idade);
    }
}