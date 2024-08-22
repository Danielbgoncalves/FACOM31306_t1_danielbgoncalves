import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
         for (int i = 0; i < 6; i++ ){
             System.out.printf("Entre com o número %d : \n", i);
             vet[i] = sc.nextInt();
         }

         for (int i = 5; i >= 0; i-- ){
             System.out.printf("%d ", vet[i]);
         }
    }



    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int i = 0;
        int var = 0;
        while( true ){
            System.out.printf("Digite  um número:");
            var = sc.nextInt();
            System.out.printf("\n");

            if(var % 2 == 0){
                vet[i] = var;
                i++;
            } else{
                System.out.printf("valor inválido: \n");
            }
            if( i == 6) break;
        }
    }

    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        ex04();
    }


}
