public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    Produto( String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public void show(){
        System.out.printf("\nNome: %s \nPreço: %.2f\nQuantidade em estoque: %d\n", this.nome, this.preco, this.qtdEstoque);
    }





}
