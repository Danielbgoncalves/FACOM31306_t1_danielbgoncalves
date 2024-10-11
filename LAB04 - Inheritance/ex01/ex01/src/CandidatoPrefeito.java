public class CandidatoPrefeito {
    private String nome;
    private String dataNasc;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int nmrPartido;
    private String partidoVice;

    public CandidatoPrefeito(String nome, String dataNasc, String genero,  double bens, boolean reeleicao,
                    int nmrPartido, String partidoVice){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.nmrPartido = nmrPartido;
        this.partidoVice = partidoVice;
    }

    @Override
    public String toString() {
        return "CandidatoPrefeito{" +
                "nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", genero='" + genero + '\'' +
                ", bens=" + bens +
                ", reeleicao=" + reeleicao +
                ", nmrPartido=" + nmrPartido +
                ", partidoVice='" + partidoVice + '\'' +
                '}';
    }
}
