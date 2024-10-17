public class Quadrado extends FormaBidimensional{
    protected float lado;

    public Quadrado(String nome, float lado){
        super(nome);
        this.lado = lado;
    }

    public float obterArea(){
        return lado * lado;
    }

    public String descricao(){
        return nome + " de área " + obterArea();
    }
}
