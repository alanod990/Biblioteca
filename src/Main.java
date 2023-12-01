Livro livro1 = new Livro("Java Programming", "John Doe");
Livro livro2 = new Livro("Data Structures", "Jane Smith");

Usuario usuario1 = new Usuario("Alice", 25);
Usuario usuario2 = new Usuario("Bob", 30);

usuario1.exibirDetalhes();
usuario2.exibirDetalhes();

Biblioteca biblioteca = new Biblioteca();

biblioteca.adicionarLivro(livro1);
biblioteca.adicionarLivro(livro2);

biblioteca.cadastrarUsuario(usuario1);
biblioteca.cadastrarUsuario(usuario2);

biblioteca.exibirAcervo();

biblioteca.realizarEmprestimo(livro1, usuario1);

AvaliacaoLivro avaliacao = new AvaliacaoLivro(livro1, usuario1, 4);
avaliacao.realizarAvaliacao();

avaliacao.exibirAvaliacao();