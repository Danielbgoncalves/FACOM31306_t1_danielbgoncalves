public class Main {
    public static void main(String[] args) {
        Candidatos Cicero = new Candidatos();

        Candidatos Eggert = new Candidatos();

        Candidatos Walacy = new Candidatos();

        double ciceroRicão = Cicero.getBens();

        Cicero.setNome("CICERO QUEDEVEZ GROBÉRIO");
        Cicero.setDataNasc("15/02/1962");
        Cicero.setGenero("masc");
        Cicero.setBens(480067.00);
        Cicero.setReeleicao(false);
        Cicero.setNmrPartido(22);
        Cicero.setCargo(("Prefeito");

        Eggert.setNome("CLAUDIO EGGERT");
        Eggert.setDataNasc("24/12/1976");
        Eggert.setGenero("masc");
        Eggert.setBens(10920.00);
        Eggert.setReeleicao(false);
        Eggert.setNmrPartido(40);
        Eggert.setCargo(("Prefeito");

        Walacy.setNome("WALACY BASILIO");
        Walacy.setDataNasc("24/12/1976");
        Walacy.setGenero("masc");
        Walacy.setBens(2352634.00);
        Walacy.setReeleicao(false);
        Walacy.setNmrPartido(13);
        Walacy.setCargo(("Prefeito");


        Cicero.panfleto();
        Eggert.panfleto();
        Walacy.panfleto();
    }
}