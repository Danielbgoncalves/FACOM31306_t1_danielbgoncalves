public class Candidato {
    protected String nome;
    protected String dataNasc;
    protected String genero;
    protected double bens;
    protected boolean reeleicao;
    protected String nmrPartido;

    public Candidato(String nome, String dataNasc, String genero,  double bens, boolean reeleicao,
                             String nmrPartido){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.nmrPartido = nmrPartido;
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
                '}';
    }
}
