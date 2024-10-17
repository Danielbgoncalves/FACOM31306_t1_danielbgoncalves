public class Empresa {
    public static void main(String[] args) {

        Funcionario []vecFuncionario = new Funcionario[8];
        vecFuncionario[0] = new Chefe("Maria", "12/09/1973", 10000.00f);
        vecFuncionario[1] = new Chefe("Euclides da Cunha", "23/01/1998", 10020.20f);

        vecFuncionario[2] = new Vendedor("Céci", "30/11/2003", 1800.00f, 234, 0.15f);
        vecFuncionario[3] = new Vendedor("Carlitos", "03/05/2002", 1800.00f, 198, 0.2f);

        vecFuncionario[4] = new Operario("Hugão", "05/12/1982", 2300.00f, 7.8f, 357);
        vecFuncionario[5] = new Operario("Géssica Jones", "01/09/2001", 2450.00f, 8.0f, 2851 );

        vecFuncionario[6] = new Horarista("Dona Patrícia", "23/04/1979", 1450.00f, 100.0f, 20.0f);
        vecFuncionario[7] = new Horarista("Dona Záza", "23/04/1979", 1450.00f, 90.0f, 20.0f);

        for(Funcionario colaborador: vecFuncionario){
            System.out.println(colaborador.toString());
        }

    }
}