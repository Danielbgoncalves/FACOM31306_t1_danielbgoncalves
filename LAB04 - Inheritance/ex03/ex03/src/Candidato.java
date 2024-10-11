public class Candidato {
    private String nome;
    private String dataNasc;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private String nmrPartido;

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

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public double getBens() {
        return bens;
    }

    public boolean isReeleicao() {
        return reeleicao;
    }

    public String getNmrPartido() {
        return nmrPartido;
    }
}
