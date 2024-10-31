public class Main {
    public static void main(String[] args) {
        Classificavel[] produtos = {
                new Produto("garrafinha", "de agua", 5.00, "abc-e"),
                new Produto("caneca", "de café", 15.00, "dfc-e"),
                new Produto("notebook", "gamer", 5000.00, "afsc-e"),
                new Produto("mochila", "escolar", 80.00, "gbac-e")
        };

        Classificavel[] clientes = {
                new Cliente("Gilberto", "1234636-45", "40028922"),
                new Cliente("Ana", "9876543-21", "99998888"),
                new Cliente("Carlos", "1234567-89", "77776666"),
                new Cliente("Beatriz", "11112222-33", "55554444")
        };

        Classificavel[] servicos = {
                new Servico("delivery", 10.00, "31/10/24"),
                new Servico("consultoria", 200.00, "01/11/24"),
                new Servico("limpeza", 50.00, "02/11/24"),
                new Servico("suporte técnico", 75.00, "03/11/24")
        };

        Classificador c = new Classificador();
        c.ordena(produtos);
        c.ordena(clientes);
        c.ordena(servicos);

        for(Classificavel produto : produtos)
            System.out.println(produto.toString());

        System.out.println();

        for(Classificavel cliente : clientes)
            System.out.println(cliente.toString());

        System.out.println();


        for(Classificavel servico : servicos)
            System.out.println(servico.toString());

        System.out.println();

    }
}