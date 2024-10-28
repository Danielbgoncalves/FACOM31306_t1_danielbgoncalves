public class Main {
    public static void main(String[] args) {
        Operacao a = new Operacao();
        double result;
        try{
            result = a.iniciarOperacao(13198.98, 9723.09);
            System.out.println("O resultado da visisao foi " + result);
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }

        try{
            result = a.iniciarOperacao(131.89, 0);
            System.out.println("O resultado da visisao foi " + result);
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }


    }
}