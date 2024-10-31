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

    public boolean eMenorQue(Classificavel obj){
        Produto p = (Produto)obj;
        if(codigo.compareTo(p.codigo) < 0){
            return true;
        } else {
            return false;
        }
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
