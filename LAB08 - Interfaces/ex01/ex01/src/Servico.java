public class Servico implements Classificavel{
    private String descricao;
    private double preco;
    private String data;

    public Servico(String descricao, double preco, String data) {
        this.descricao = descricao;
        this.preco = preco;
        this.data = data;
    }

    public boolean eMenorQue(Classificavel obj) {
        Servico p = (Servico)obj;
        if(preco < p.preco){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", data='" + data + '\'' +
                '}';
    }
}
