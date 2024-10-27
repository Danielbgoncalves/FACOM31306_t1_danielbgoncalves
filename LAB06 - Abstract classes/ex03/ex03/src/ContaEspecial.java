public class ContaEspecial extends ContaCorrente{
    protected float limiteEspecial;

    public ContaEspecial(float val, int num, int pwd, float limite){
        super(val, num, pwd);
        this.limiteEspecial = limite;
    }

    public ContaCorrente setLimiteEspecial(int novoLimite){
        if(novoLimite == 0){
            ContaComum a = new ContaComum(this.saldo, this.numConta, this.senha);
            return a;
        } else {
            this.limiteEspecial = novoLimite;
            return this;
        }

    }
}
