public class Funcionario {
    protected String nome;
    protected String dataNasc;
    protected float salario;

    public Funcionario(String nome, String dataNasc, float salario) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public float getSalario() { return salario; }
}
