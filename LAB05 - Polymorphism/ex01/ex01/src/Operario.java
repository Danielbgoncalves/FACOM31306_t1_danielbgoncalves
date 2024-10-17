public class Operario extends Funcionario {
    private float valorPorProducao;
    private int qntProduzida;

    public Operario(String nome, String dataNasc, float salario, float valorPorProducao, int qntProduzida) {
        super(nome, dataNasc, salario);
        this.valorPorProducao = valorPorProducao;
        this.qntProduzida = qntProduzida;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "valorPorProducao=" + valorPorProducao +
                ", qntProduzida=" + qntProduzida +
                ", nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", salario=" + getSalario() +
                '}';
    }

    public float getSalario(){
        return salario + qntProduzida*valorPorProducao;
    }
}
