public class FolhaPagamento {
    protected Funcionario []lista;

    public FolhaPagamento(Funcionario []lista){
        this.lista = lista;
    }

    public void imprimeFolha(){
        //String valor;
        for(Funcionario f: lista){
            System.out.println( f.nome +": " + f.getSalario());
        }
    }
}
