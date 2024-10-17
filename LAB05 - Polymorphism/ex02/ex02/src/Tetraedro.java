public class Tetraedro extends FormaTridimensional{
    protected float lado;
    protected float altura;

    public Tetraedro(String nome, float lado, float altura){
        super(nome);
        this.lado =  lado;
        this.altura = altura;
    }

    public float obterVolume(){
        return (float)(Math.pow(lado, 2.0) * Math.pow(3.0, 1.0/3.0));
    }

    public float getArea(){
        return 1.0f/3.0f * getAreaBase() * altura;
    }

    public float getAreaBase(){
        return lado * lado / 2.0f;
    }

    public String descricao(){
        return nome + " de volume " + obterVolume();
    }
}
