public class Funcionario {
    protected String CPF;
    protected String nome;
    protected float salario;
    private float tetoSalarial;

    public Funcionario(String CPF, float salario, String nome) {
        this.CPF = CPF;
        this.salario = salario;
        this.nome = nome;
        this.tetoSalarial = 40000.00f;
    }

    public void setSalario(float salario) {
        if(salario <= 40000.00f)
            this.salario = salario;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTetoSalarial(float tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    public String getCPF() {
        return CPF;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public float getTetoSalarial() {
        return tetoSalarial;
    }

    public void aumentoSlarial( float porcento){
        float temp;
        temp = this.salario + this.salario*porcento;
        if(temp > 40000.00f)
            throw new IllegalArgumentException("Valor ultrapassa o teto");
        else if (temp < 0.00f)
            throw new IllegalArgumentException("Valor inválido de salário");
        else this.salario = temp;
    }
}
