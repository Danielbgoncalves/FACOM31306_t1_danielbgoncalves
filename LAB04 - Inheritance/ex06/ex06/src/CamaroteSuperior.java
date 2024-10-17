public class CamaroteSuperior extends VIP{
    protected String localizacao;
    protected float valorAdicional;
    public CamaroteSuperior(float valor, float valorExtra, String localizacao, float valorAdicional){
        super(valor, valorExtra);
        this.localizacao = localizacao;
        this.valorAdicional = valorAdicional;
    }

    public String ImprimirLocalizacao(){
        return "Camarote inferior; a se realizar em " + localizacao;
    }

    public float ImprimirValor(){
        return super.getValor() + valorAdicional;
    }
}
