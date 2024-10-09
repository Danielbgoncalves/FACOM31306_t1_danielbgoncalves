public class Livro {
    String autor;
    String nome;
    String genero;
    boolean paraMaiores;

    public Livro(String autor,String nome, boolean paraMaiores, String genero) {
        this.autor = autor;
        this.nome = nome;
        this.paraMaiores = paraMaiores;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor=" + autor +
                ", genero='" + genero + '\'' +
                ", paraMaiores=" + paraMaiores +
                '}';
    }

    public String getAutor() {
        return autor;
    }
}
