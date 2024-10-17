public class Main {
    public static void main(String[] args) {
        Forma []vec = new Forma[6];
        vec[0] = new Circulo("Cículo top", 3.67f);
        vec[1] = new Quadrado("Quadrado 4 lados", 32.6f);
        vec[2] = new Triangulo("Triangulo maneiro", 12.76f, 51.4f);
        vec[3] = new Esfera("Ex fera", 29.0f);
        vec[4] = new Cubo("Cubo Cubóide", 43.89f);
        vec[5] = new Tetraedro("Tetraedro Claudio", 32.66f, 35.8f);

        for(Forma item: vec){
            System.out.println(item.descricao());
        }
    }
}