public class Main {
    public static void main(String[] args) {
        Candidatos Cicero = new Candidatos("CICERO QUEDEVEZ GROBÉRIO", "15/02/1962",
                "masc", 480067.00, false, 22, "Prefeito");

        Candidatos Eggert = new Candidatos("CLAUDIO EGGERT", "24/08/1976",
                "masc", 10920.00,false, 40, "Prefeito");

        Candidatos Walacy = new Candidatos("WALACY BASILIO", "24/12/1976",
                "masc", 2352634.00,false, 13, "Prefeito");

        Cicero.panfleto();
        Eggert.panfleto();
        Walacy.panfleto();

        //oiapoque !!!!!!!!!!!!!!!!!!!!!!! -> Pancas
    }
}