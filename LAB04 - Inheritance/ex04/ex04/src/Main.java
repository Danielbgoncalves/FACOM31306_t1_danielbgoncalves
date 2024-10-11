public class Main {
    public static void main(String[] args) {

        C2 c = new C2("Arnaldin", 121, true, "paquistanes", "azul", "flocos");
        C1 b = new C1("Ari", 121, true);
        C3 a = new C3("Ari", 121, true, "brazilian", "amarelo", "flocos de caipinha", false, true, true);

        a.mostrar_atributos_super();

    }
}