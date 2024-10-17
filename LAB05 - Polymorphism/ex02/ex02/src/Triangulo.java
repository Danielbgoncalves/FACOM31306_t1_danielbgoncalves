public class Triangulo extends FormaBidimensional{
    protected float altura;
    protected float base;

    public Triangulo(String nome, float altura, float base){
        super(nome);
        this.altura = altura;
        this.base = base;
    }

    public float obterArea(){
        return altura * base * 0.5f;
    }

    public String descricao(){
        return nome + " de área " + obterArea();
    }
}
