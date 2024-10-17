public class Cubo extends FormaTridimensional{
    protected float lado;

    public Cubo(String nome, float lado){
        super(nome);
        this.lado =  lado;
    }

    public float obterVolume(){
        return (float) Math.pow(lado, 3.0);
    }

    public float obterArea(){
        return lado*lado * 6.0f;
    }

    public String descricao(){
        return nome + " de volume " + obterVolume();
    }
}
