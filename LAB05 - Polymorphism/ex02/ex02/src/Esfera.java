public class Esfera extends FormaTridimensional{
    protected float raio;

    public Esfera(String nome, float raio){
        super(nome);
    }

    public float obterVolume(){
        return  (float)(4.0/3.0 * Math.PI * Math.pow(raio, 3.0));
    }

    public float obterArea(){
        return (float)(4 * Math.PI * raio * raio);
    }

    public String descricao(){
        return nome + " de volume " + obterVolume();
    }

}
