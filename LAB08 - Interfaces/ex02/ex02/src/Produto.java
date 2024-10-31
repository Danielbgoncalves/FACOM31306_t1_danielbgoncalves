public class Produto implements Classificavel {
    private String nome;
    private String descricao;
    private double preco;
    private String codigo;

    public Produto(String nome, String descricao, double preco, String codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
    }

    public int eMenorQue(Classificavel obj){
        Produto p = (Produto)obj;
        return codigo.compareTo(p.codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
