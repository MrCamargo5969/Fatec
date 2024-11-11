public class Livro {
    public String titulo;
    public String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
