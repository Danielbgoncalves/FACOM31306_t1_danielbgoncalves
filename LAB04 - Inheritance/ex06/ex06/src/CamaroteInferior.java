public class CamaroteInferior extends VIP{
    protected String localizacao;
    public CamaroteInferior(float valor, float valorExtra, String localizacao){
        super(valor, valorExtra);
        this.localizacao = localizacao;
    }

    public String ImprimirLocalizacao(){
        return "Camarote inferior; a se realizar em " + localizacao;
    }
}
