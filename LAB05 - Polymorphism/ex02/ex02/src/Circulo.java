public class Circulo extends FormaBidimensional{
    protected float raio;

    public Circulo(String nome, float raio){
        super(nome);
        this.raio = raio;
    }

    public float obterArea(){
        return (float)Math.PI * raio * raio;
    }

    public String descricao(){
        return nome + " de área " + obterArea();
    }
}
