import java.util.Arrays;

public class Estante {
    private int qntLivrosTotal;
    private String material;
    private boolean limpa;
    private Livro[] vecLivros;

    public Estante(String material, boolean limpa) {
        this.qntLivrosTotal = 0;
        this.material = material;
        this.limpa = limpa;
        vecLivros = new Livro[10];
    }

    @Override
    public String toString() {
        // Filtra os valores não nulos de vecLivros
        String livrosNaoNulos = Arrays.stream(vecLivros)
                .filter(livro -> livro != null) // Só retorna os livros q não sao nulos
                .map(Livro::toString)           // Converte para String usando o toString() de Livro
                .reduce((livro1, livro2) -> livro1 + ", " + livro2) // Concatena
                .orElse("Nenhum livro");

        return "Estante{" +
                "qntLivrosTotal=" + qntLivrosTotal +
                ", material='" + material + '\'' +
                ", limpa=" + limpa +
                ", vecLivros=" +"[" + livrosNaoNulos + "]" +
                '}';
    }

    public void adicionarLivro(Livro novo){
        if(qntLivrosTotal < vecLivros.length){
            vecLivros[qntLivrosTotal] = novo;
            qntLivrosTotal++;
        }

    }


}
