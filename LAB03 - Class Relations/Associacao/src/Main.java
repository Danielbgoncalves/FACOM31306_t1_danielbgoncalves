public class Main {
    public static void main(String[] args) {
        Livro a = new Livro("Agnaldo Pereira Tonholo", "A caminhada noturna", false, "Suspense");
        Livro b = new Livro("Agnaldo Pereira Tonholo", "Sobre homens e ratos", true, "Suspense");


        Autor Agnaldo = new Autor("Agnaldo Pereira Tonholo", 61);
        Agnaldo.escreveLivro(a);
        Agnaldo.escreveLivro(b);

        Agnaldo.divulgarAutor();
    }
}