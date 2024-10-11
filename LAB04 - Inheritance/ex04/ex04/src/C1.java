public class C1 {
    public String nome;
    private int idade;
    protected boolean existe;

    public C1(String nome, int idade, boolean existe) {
        this.nome = nome;
        this.idade = idade;
        this.existe = existe;
        System.out.println("Classe C1: chamada do construtor padrao, com parametros");
    }

    public C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    @java.lang.Override
    public java.lang.String toString() {
        return
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", existe=" + existe;

    }

    public void mostrar_atributos(){
        System.out.println(this.toString());
    }

    public int getIdade() {
        return idade;
    }
}