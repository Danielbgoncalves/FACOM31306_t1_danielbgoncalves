public class Empresa {
    public static void main(String[] args) {

        Funcionario []vecFuncionario = new Funcionario[8];
        Chefe []vecChefe = new Chefe[2];
        vecChefe[0] = new Chefe("Maria", "12/09/1973", 10000.00f);
        vecChefe[1] = new Chefe("Euclides da Cunha", "23/01/1998", 10020.20f);

        Vendedor []vecVendedor = new Vendedor[2];
        vecVendedor[0] = new Vendedor("Céci", "30/11/2003", 1800.00f, 234, 0.15f);
        vecVendedor[1] = new Vendedor("Carlitos", "03/05/2002", 1800.00f, 198, 0.2f);

        Operario []vecOperario = new Operario[2];
        vecOperario[0] = new Operario("Hugão", "05/12/1982", 2300.00f, 7.8f, 357);
        vecOperario[1] = new Operario("Géssica Jones", "01/09/2001", 2450.00f, 8.0f, 2851 );

        Horarista []vecHorarista = new Horarista[2];
        vecHorarista[0] = new Horarista("Dona Patrícia", "23/04/1979", 1450.00f, 100.0f, 20.0f);
        vecHorarista[1] = new Horarista("Dona Záza", "23/04/1979", 1450.00f, 90.0f, 20.0f);

        vecFuncionario[0] = vecChefe[0];
        vecFuncionario[1] = vecChefe[1];
        vecFuncionario[2] = vecVendedor[0];
        vecFuncionario[3] = vecVendedor[1];
        vecFuncionario[4] = vecOperario[0];
        vecFuncionario[5] = vecOperario[1];
        vecFuncionario[6] = vecHorarista[0];
        vecFuncionario[7] = vecHorarista[1];

        /*for(Funcionario colaborador: vecFuncionario){
            System.out.println(colaborador.toString());
        }*/

        FolhaPagamento folhaMes01 = new FolhaPagamento(vecFuncionario);
        folhaMes01.imprimeFolha();

    }
}