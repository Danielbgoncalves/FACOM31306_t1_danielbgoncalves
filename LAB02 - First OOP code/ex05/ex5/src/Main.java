
public class Main{
    public static void main(String[] args){
        Eleicao vet[] = new Eleicao[4];

        String candidatos1[] = {"MARCELO CIMENTAÇO", "MAURO GODINHO", "TATA DO CAFÉ" };
        String candidatos2[] = {"JOSÉ ROBERTO", "JURANDIR DA SOS", "RHAIZA MATOS", "RODRIGO SACUNO"};
        String candidatos3[] = {"CICERO GROBÉRIO", "CLAUDIO EGGERT", "GUIMA", "WALACY BASILIO" };

        vet[0] = new Eleicao("Ervália",20255 , candidatos1 );
        vet[1] = new Eleicao("Naviraí",50457, candidatos2);
        vet[2] = new Eleicao("Pancas",18893 , candidatos3);


        for(Eleicao cidade: vet){
            cidade.show();
        }

    }
}


