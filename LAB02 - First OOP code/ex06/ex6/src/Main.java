public class Main{
    public static void main(String[] args){
        Candidatos []vet = new Candidatos[5];
        vet[0] = new Candidatos("CICERO QUEDEVEZ GROBÉRIO", "15/02/1962",
                "masc", 480067.00, false, 22, "Prefeito");
        vet[1] = new Candidatos("CLAUDIO EGGERT", "24/08/1976",
                "masc", 10920.00,false, 40, "Prefeito");
        vet[2] = new Candidatos("WALACY BASILIO", "24/12/1976",
                "masc", 232634.00,false, 13, "Prefeito");
        vet[3] = new Candidatos("WAGNER MOURA", "20/10/1985",
                "masc", 231634.00,true, 1, "Prefeito");
        vet[4] = new Candidatos("BRINITTANY JEANETTE ELEONOR", "29/01/1976",
                "fem", 718634.00,true, 90, "Prefeita");

        Eleicao CidadeFic = new Eleicao("Daniel Landia", 123456, vet);

        CidadeFic.relacaoDeBens();

    }
}