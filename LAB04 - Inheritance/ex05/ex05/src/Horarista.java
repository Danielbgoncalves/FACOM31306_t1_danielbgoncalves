public class Horarista extends Funcionario{
    private float qntHorasTrab;
    private float valorPorHora;

    public Horarista(String nome, String dataNasc, float salario, float qntHorasTrab, float valorPorHora) {
        super(nome, dataNasc, salario);
        this.qntHorasTrab = qntHorasTrab;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "Horarista{" +
                "qntHorasTrab=" + qntHorasTrab +
                ", valorPorHora=" + valorPorHora +
                ", nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", salario=" + getSalario() +
                '}';
    }

    public float getSalario(){
        return salario + valorPorHora*qntHorasTrab;
    }
}
