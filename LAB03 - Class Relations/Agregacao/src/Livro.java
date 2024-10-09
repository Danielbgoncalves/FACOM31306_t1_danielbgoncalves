public class Livro {
    private String autor;
    private String nome;
    private String genero;
    private int nmrPaginas;

    public Livro(String autor,String nome, String genero, int nmrPaginas) {
        this.autor = autor;
        this.nome = nome;
        this.genero = genero;
        this.nmrPaginas = nmrPaginas;
    }

    @Override
    public String toString() {
        return "\nLivro{" +
                "autor=" + autor +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getAutor() {
        return autor;
    }
}
