import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void registrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                livro.exibirInformacoes();
            }
        }
    }
}
