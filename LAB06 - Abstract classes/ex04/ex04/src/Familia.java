public class Familia extends Contatos{
    protected String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco){
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public String imprimirContato(){
        return  super.imprimirBasico() +
                "parentesco =' " + parentesco + "' ";
    }

    public String getParentesco(){
        return parentesco;
    }

}
