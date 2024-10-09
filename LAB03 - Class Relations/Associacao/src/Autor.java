public class Autor {
   private String nome;
   private int idade;
   private int qntDeLivros;
   private Livro livros[];

    Autor(String nome, int idade){
        this.idade = idade;
        this.livros = new Livro[10];
        this.nome = nome;
        this.qntDeLivros = 0;
    }

    public String getNome() { return nome; }

    public int getQntDeLivros() { return qntDeLivros; }

    public int getIdade() { return idade; }

    @Override
    public String toString() {
        return "Autor: " +
                "nome = " + nome +
                ", idade = " + idade +
                ", qntDeLivros = " + qntDeLivros;
    }

    public void escreveLivro(Livro a){
        if(a.getAutor().compareTo(nome) == 0 ){
            this.livros[qntDeLivros] = a;
            qntDeLivros++;
        } else {
            System.out.println("Esse autor não escreveu esse livro não\n");
        }

    }

    public void divulgarAutor(){
        for(int i = 0; i < qntDeLivros; i++)
            System.out.println(livros[i].toString());
    } // agregação é a relacao de estante e livros


}
