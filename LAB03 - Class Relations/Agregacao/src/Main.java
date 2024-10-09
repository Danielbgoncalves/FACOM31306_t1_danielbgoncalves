public class Main {
    public static void main(String[] args) {
        Livro a = new Livro("Harper Lee","O Sol é Para Todos","Ficção", 364);
        Livro b = new Livro("Jane Austen","Orgulho e Preconceito","Romance",  432);
        Livro c = new Livro("George Orwel","1984","Distopia, Ficção científica",  328);

        Estante daSala = new Estante("Madeira", true);
        daSala.adicionarLivro(a);
        daSala.adicionarLivro(b);
        daSala.adicionarLivro(c);
        //daSala.adicionarLivro(d);


        System.out.println(daSala.toString());


    }
}