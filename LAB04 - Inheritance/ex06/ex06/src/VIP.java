public class VIP extends Ingresso{
    protected float valorExtra;

    public VIP(float valor, float valorExtra){
        super(valor);
        this.valorExtra = valorExtra;
    }

    public float getValor(){
        return valor + valorExtra;
    }

}
