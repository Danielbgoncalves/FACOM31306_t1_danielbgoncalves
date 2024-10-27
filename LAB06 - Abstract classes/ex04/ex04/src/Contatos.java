abstract class Contatos {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contatos( String apelido, String nome, String email, String aniversario){
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        return "apelido='" + apelido + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", aniversario='" + aniversario + '\'';
    }

    public String imprimirContato(){
        return null;
    }
}
