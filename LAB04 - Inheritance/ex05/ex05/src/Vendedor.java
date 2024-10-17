public class Vendedor  extends Funcionario {
    private int numVendas;
    private float comissao;

    public Vendedor(String nome, String dataNasc, float salario, int numVendas, float comissao) {
        super(nome, dataNasc, salario);
        this.numVendas = numVendas;
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "numVendas=" + numVendas +
                ", comissao=" + comissao +
                ", nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", salario=" + getSalario() +
                '}';
    }

    public float getSalario(){
        return salario + numVendas*comissao;
    }

}
