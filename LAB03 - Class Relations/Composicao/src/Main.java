public class Main {
    public static void main(String[] args) {
        Pagina[] vec = new Pagina[3];
        vec[0]  = new Pagina(1, "Ao verme que primeiro roeu ... ", "conservada");
        vec[1]  = new Pagina(2, "...as frias carnes do meu cadáver dedico ...", "nova");
        vec[2]  = new Pagina(3, "... como saudosa lembrança estas memórias póstumas. ", "manchada");

        Livro top = new Livro("Machado de Assis", "Memórias Póstumas", 10);

        for(Pagina item: vec ){
            top.adicionarPagina(item);
            item = null;
        }

        System.out.println(top.toString());
    }
}