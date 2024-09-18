public class Main {
    public static void main(String[] args) {
        Candidatos[] vet = new Candidatos[3];

        vet[0] = new Candidatos("CICERO QUEDEVEZ GROBÉRIO", "15/02/1962",
                "masc", 480067.00, false, 22, "Prefeito");
        vet[1] = new Candidatos("CLAUDIO EGGERT", "24/08/1976",
                "masc", 10920.00,false, 40, "Prefeito");
        vet[2] = new Candidatos("WALACY BASILIO", "24/12/1976",
                "masc", 2352634.00,false, 13, "Prefeito");

        for(Candidatos candidato: vet)
            candidato.panfleto();

    }
}