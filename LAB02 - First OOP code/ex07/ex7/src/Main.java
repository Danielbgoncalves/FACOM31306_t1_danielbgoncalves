public class Main{
    public static void  main(String[] batata){
        Produto aux = new Produto("a", 0);
        Produto []vec = new Produto[6];

        vec[0] = new Produto("Anjo Mecânico", 20, 2);
        vec[1] = new Produto("Os Artifícios da Trevas", 60, 23);
        vec[2] = new Produto("Senhor das Sombras", 55, 16);
        vec[3] = new Produto("As Últimas Horas", 35);
        vec[4] = new Produto("Cidade do Fogo Celestial", 15, 15);
        vec[5] = new Produto("Rainha Do Ar e da Escuridão", 100);
        // Só livro top ta

        for(int i = 0; i < vec.length; i++ ){
            for( int j = 0; j < vec.length - i - 1; j++){
                if(vec[j].getNome().compareTo(vec[j + 1].getNome()) > 0){
                    aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }

        for(Produto item: vec){
            item.show();
        }
    }


}