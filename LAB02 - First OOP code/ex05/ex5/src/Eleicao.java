public class Eleicao {
    private String municipio;
    private int nmrVotantes;
    private String candidatos[];

    public Eleicao(String municipio, int nmrVotantes, String candidatos[]){
        this.municipio = municipio;
        this.nmrVotantes = nmrVotantes;
        this. candidatos = candidatos;
    }

    public void show(){
        System.out.print("Município " + municipio + ": possui " + nmrVotantes + " votantes  e os seguintes candidatos: \n");
        for(String nome: candidatos)
            System.out.println(nome);

    }


}
/*Crie uma nova classe chamada Eleição (Eleicao - evitar acentuação e cedilha), que é composta pelo nome do
município, o número de votantes, os candidatos, e outras informações que julgar pertinente. Instancie duas
Eleições (busque por outro município). Inicialize os dados dos objetos por meio dos construtores. Mostre na tela
todos os dados cadastrados.*/