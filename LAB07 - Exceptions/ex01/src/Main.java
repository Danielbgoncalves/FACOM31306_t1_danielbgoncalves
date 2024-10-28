public class Main {
    public static void main(String[] args) {
        Funcionario a = new Funcionario("1234567890-00", 17433.90f, "Cleiton da Rocha");
        try {
            a.aumentoSlarial(5); // aumento de 5 vezes
        } catch (IllegalArgumentException e){
            System.out.println("Erro ao aumentar salario: " + e.getMessage());
        } finally {
            System.out.println("O salario atualmente é: " + a.getSalario());
        }
    }
}