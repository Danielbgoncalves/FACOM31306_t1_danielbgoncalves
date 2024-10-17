public class Esfera extends FormaTridimensional{
    protected float raio;

    public Esfera(String nome, float raio){
        super(nome);
        this.raio = raio;
    }

    public float obterVolume(){
        return (4.0f/3.0f) * (float)Math.PI * raio * raio * raio ;
    }

    public float obterArea(){
        return (float)(4 * Math.PI * raio * raio);
    }

    public String descricao(){
        return nome + " de volume " + obterVolume();
    }

}
