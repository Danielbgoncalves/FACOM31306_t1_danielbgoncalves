public class Vereador extends Candidato{
    private String partidoVice;

    public Vereador(String nome, String dataNasc, String genero, double bens, boolean reeleicao, String nmrPartido, String partidoVice) {
        super(nome, dataNasc, genero, bens, reeleicao, nmrPartido);
        this.partidoVice = partidoVice;
    }

    public Vereador(Candidato a, String partidoVice) {
        super(a.getNome(), a.getDataNasc(), a.getGenero(), a.getBens(), a.isReeleicao(), a.getNmrPartido());
        this.partidoVice = partidoVice;
    }



    @Override
    public String toString() {
        return super.toString() + "Vereador{" +
                "partidoVice='" + partidoVice + '\'' +
                '}';
    }
}
