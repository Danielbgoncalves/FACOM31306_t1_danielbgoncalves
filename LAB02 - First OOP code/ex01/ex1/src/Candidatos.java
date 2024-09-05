public class Candidatos {
    String nome;
    String dataNasc;
    String genero;
    double bens;
    boolean reeleicao;
    int nmrPartido;
    String cargo;

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

}
