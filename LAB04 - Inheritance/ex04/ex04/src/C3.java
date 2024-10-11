public class C3 extends C2{

    public boolean jaSaiuDaOrbita;
    private boolean esportista;
    protected boolean estiloso;

    public C3(String nome, int idade, boolean existe, String nacionalidade, String cor, String saborDeSorveteFavorito, boolean jaSaiuDaOrbita, boolean esportista, boolean estiloso) {
        super(nome, idade, existe, nacionalidade, cor, saborDeSorveteFavorito);
        this.jaSaiuDaOrbita = jaSaiuDaOrbita;
        this.esportista = esportista;
        this.estiloso = estiloso;
        System.out.println("Classe C3: chamada do construtor padrao, com parametros");

    }

    public C3(String nome, int idade, boolean existe, String nacionalidade, String cor, String saborDeSorveteFavorito){
        super(nome,idade, existe, nacionalidade, cor, saborDeSorveteFavorito);

    }


    public C3() {
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    @Override
    public String toString() {
        return "C3{" +
                "nome='" + nome + '\'' +
                ", idade=" + this.getIdade() +
                ", existe=" + existe +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", cor='" + this.getCor() + '\'' +
                ", saborDeSorveteFavorito='" + saborDeSorveteFavorito + '\'' +
                "jaSaiuDaOrbita=" + jaSaiuDaOrbita +
                ", esportista=" + esportista +
                ", estiloso=" + estiloso +
                '}';
    }

    @Override
    public void mostrar_atributos() {
        System.out.println();
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos();

    }
}
