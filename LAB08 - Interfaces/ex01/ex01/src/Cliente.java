import java.util.Objects;

public class Cliente implements Classificavel{
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public boolean eMenorQue(Classificavel obj){
        Cliente p = (Cliente)obj;
        if(nome.compareTo(p.nome) < 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
