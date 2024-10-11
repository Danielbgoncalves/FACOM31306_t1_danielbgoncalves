public class CandidatoVereador {
    private String nome;
    private String dataNasc;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private String nmrPartido;
    private String bairroOndeMora;

    public CandidatoVereador(String nome, String dataNasc, String genero,  double bens, boolean reeleicao,
                      String nmrPartido, String bairroOndeMora){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.nmrPartido = nmrPartido;
        this.bairroOndeMora = bairroOndeMora;
    }

    @Override
    public String toString() {
        return "CandidatoVereador{" +
                "nome='" + nome + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                ", genero='" + genero + '\'' +
                ", bens=" + bens +
                ", reeleicao=" + reeleicao +
                ", nmrPartido='" + nmrPartido + '\'' +
                ", bairroOndeMora='" + bairroOndeMora + '\'' +
                '}';
    }
}
