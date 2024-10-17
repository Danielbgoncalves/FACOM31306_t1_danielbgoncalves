import java.util.Arrays;
import java.util.stream.Stream;

public class Livro {
    String autor;
    String nome;
    Pagina[] vecPaginas;
    int max;

    public Livro(String autor,String nome, int max) {
        this.autor = autor;
        this.nome = nome;
        this.max = max;
        vecPaginas = new Pagina[max]; // Sim é um mini livro !
    }

    @Override
    public String toString() {
        /* Como se criasse um nova intância de um Stream, um Stream suporta manipulações mais uteis que um
            vetor basicão. filter retorna os elementos que satisfazem o parametro, volta cada alemento
            para o tipo Array que era inicialmente, é uma chamada do constructor de Pagina já q cada
            elemento é uma pagina.
         */
        Pagina[] vecPaginasNaoNulas = Stream.of(vecPaginas)
                    .filter(pagina -> pagina != null)
                    .toArray(Pagina[]::new);

        return "Livro{" +
                "autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                ", vecPaginas=" + Arrays.toString(vecPaginasNaoNulas) +
                '}';
    }

    public void adicionarPagina(Pagina a){
        if(vecPaginas.length <= max){
            for(int i = 0; i < max; i++)
                if(vecPaginas[i] == null){
                    vecPaginas[i] = new Pagina(a.getNmrDaPagina(), a.getConteudo(), a.getEstado());
                    break;
                }

        }
    }

}
