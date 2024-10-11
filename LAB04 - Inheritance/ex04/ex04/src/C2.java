public class C2 extends C1{
    public String nacionalidade;
    private String cor;
    protected String saborDeSorveteFavorito;

    public C2(String nome, int idade, boolean existe, String nacionalidade, String cor, String saborDeSorveteFavorito) {
        super(nome, idade, existe);
        this.nacionalidade = nacionalidade;
        this.cor = cor;
        this.saborDeSorveteFavorito = saborDeSorveteFavorito;
        System.out.println("Classe C2: chamada do construtor padrao, com parametros");

    }

    public C2() {
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "C2{" +
                "nome='" + nome + '\'' +
                ", idade = " + this.getIdade() +
                ", existe = " + existe +
                " nacionalidade = " + nacionalidade + '\'' +
                ", cor = '" + cor + '\'' +
                ", Sabor De Sorvete Favorito='" + saborDeSorveteFavorito + '\'' +
                '}';
    }




    public void mostrar_atributos(){
        System.out.println(this);
    }

    public void mostrar_atributos_super(){
        super.mostrar_atributos();
    }



    public String getCor() {
        return cor;
    }
}
