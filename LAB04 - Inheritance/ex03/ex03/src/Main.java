public class Main {
    public static void main(String[] args) {

        Prefeito Jeca = new Prefeito("Jeca Andromeda", "11/04/1978", "masculio", 1234.42, true, "32", "PUM");
        Vereador Lucy = new Vereador("Lucy Peniwidrive", "05/10/1982", "feminino", 15234.42, true, "32", "Amanhecer Cedinho");

        System.out.println(Jeca.toString());
        System.out.println(Lucy.toString());


    }
}