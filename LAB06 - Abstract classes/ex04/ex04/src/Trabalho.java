public class Trabalho extends Contatos{
    protected String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo){
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String imprimirContato(){
        return  super.imprimirBasico() +
                "tipo =' " + tipo + "' ";
    }

    public String getTipo(){
        return tipo;
    }
}
