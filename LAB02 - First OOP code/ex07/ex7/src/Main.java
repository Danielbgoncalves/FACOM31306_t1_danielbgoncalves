public class Main{
    public static void main(String[] args){
        Produto aux = new Produto("a", 0);
        Produto []vec = new Produto[11];

        vec[0] = new Produto("Anjo Mecânico", 20, 2);
        vec[1] = new Produto("Os Artifícios da Trevas", 60, 23);
        vec[2] = new Produto("Senhor das Sombras", 55, 16);
        vec[3] = new Produto("As Últimas Horas", 35);
        vec[4] = new Produto("Cidade do Fogo Celestial", 15, 15);
        vec[5] = new Produto("Rainha Do Ar e da Escuridão", 100);
        vec[6] = new Produto("Dama da Meia-Noite", 45, 10);
        vec[7] = new Produto("Príncipe Mecânico", 30, 5);
        vec[8] = new Produto("Cidade das Almas Perdidas", 40, 8);
        vec[9] = new Produto("O Código dos Caçadores de Sombras", 25, 3);
        vec[10] = new Produto("As Crônicas de Bane", 50, 7);
        // Só livro top ta

        for(int i = 0; i < vec.length; i++ ){
            for( int j = 0; j < vec.length - i - 1; j++){
                if(vec[j].getNome().compareTo(vec[j + 1].getNome()) > 0){ // retorna > 0 se o obj que chamou o metodo for "maior"
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