public class Jogador {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public Jogador(String nome, int idade, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    public int getIdade(){
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }
}
