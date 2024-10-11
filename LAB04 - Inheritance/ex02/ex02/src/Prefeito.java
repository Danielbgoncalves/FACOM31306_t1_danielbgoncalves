public class Prefeito extends Candidato{
    String nmrPartidoVice;

    public Prefeito(String nome, String dataNasc, String genero,  double bens, boolean reeleicao,
                    String nmrPartido, String nmrPartidoVice){
        super(nome, dataNasc, genero, bens, reeleicao, nmrPartido);
        this.nmrPartidoVice = nmrPartidoVice;
    }

    @Override
    public String toString() {
        return super.toString() + "Prefeito{" +
                "nmrPartidoVice='" + nmrPartidoVice + '\'' +
                '}';
    }
}
