public class Eleicao {
    private String municipio;
    private int nmrVotantes;
    private Candidatos candidatos[];

    public Eleicao(String municipio, int nmrVotantes, Candidatos candidatos[]){
        this.municipio = municipio;
        this.nmrVotantes = nmrVotantes;
        this.candidatos = candidatos;
    }

    public void show(){
        System.out.print("Município " + municipio + ": possui " + nmrVotantes + " votantes  e os seguintes candidatos: \n");
        for(Candidatos concorrente: candidatos) {
            concorrente.panfleto();
        }
    }

    private int filterByBens(){
        double maxValor = candidatos[0].getBens();
        int pos = 0;
        for(int i = 0; i < candidatos.length; i++ ){
            if(candidatos[i].getBens() > maxValor){
                maxValor = candidatos[i].getBens();
                pos = i;
            }
        }
        return pos;
    }

    private double calculaPorcentagem(Candidatos nome, int posMaxBens){
        double porcent = (100.0 / this.candidatos[posMaxBens].getBens()) * nome.getBens();
        return porcent;
    }

    public void relacaoDeBens(){
        int posMaxBens = this.filterByBens();
        System.out.printf("%s foi quem declarou mais bens; possui %.2f dinehiros \n", this.candidatos[posMaxBens].getNome(), this.candidatos[posMaxBens].getBens());
        for(Candidatos nome: this.candidatos){
            if(nome.getBens() != this.candidatos[posMaxBens].getBens()){
                double porcent = this.calculaPorcentagem(nome, posMaxBens);
                System.out.printf("O candidato %s tem %.2f%% dos bens do mais rico \n", nome.getNome(), porcent );
            }
        }
    }



}