public class Candidatos {
    private String nome;
    private String dataNasc;
    private String genero;
    private double bens;
    private boolean reeleicao;
    private int nmrPartido;
    private String cargo;

    public Candidatos(String nome, String dataNasc, String genero,  double bens, boolean reeleicao,
                      int nmrPartido,  String cargo  ){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.bens = bens;
        this.reeleicao = reeleicao;
        this.nmrPartido = nmrPartido;
        this.cargo = cargo;
    }

    public void panfleto(){
        System.out.println(nome + ": nascido em " + dataNasc + ", " + genero + ". Possui " + bens +
                " reais. É candidato à reeleição? " + reeleicao + ". O número do partido é: " + nmrPartido +
                " e concorre a " + cargo + ".");
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

    public int getNmrPartido() {
        return nmrPartido;
    }

    public String getCargo() {
        return cargo;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setBens(double bens) {
        this.bens = bens;
    }

    public void setReeleicao(boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public void setNmrPartido(int nmrPartido) {
        this.nmrPartido = nmrPartido;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



}
