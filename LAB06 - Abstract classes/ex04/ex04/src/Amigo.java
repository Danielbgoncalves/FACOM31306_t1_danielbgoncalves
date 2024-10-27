public class Amigo extends Contatos{
    protected String grau;

    public Amigo(String apelido, String nome, String email, String aniversario, String grau){
        super(apelido, nome, email, aniversario);

        if(grau.compareTo("1") != 0 || grau.compareTo("2") != 0 || grau.compareTo("2") != 0 ){
            throw new RuntimeException("Entrada do grau de amizade inválida");
        }
        this.grau = grau;
    }

    public String imprimirContato(){
        return  super.imprimirBasico() +
                "grau de amizade =' " + grau + "' ";
    }

    public String getGrau() {
        return grau;
    }
}
