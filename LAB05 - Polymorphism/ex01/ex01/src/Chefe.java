public class Chefe extends Funcionario{

    public Chefe(String nome, String dataNasc, float salario) {
        super(nome, dataNasc, salario);
    }

    @Override
    public String toString() {
        return "Chefe{" +
                "nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", salario=" + salario +
                '}';
    }
}
