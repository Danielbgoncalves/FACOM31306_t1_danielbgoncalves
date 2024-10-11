import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int quantos;
        String subs;
        String comparaPositivo = "s";
        String nome;
        System.out.print("Quantos times vão disputar ? =>");
        quantos = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Time[] vetor = new Time[quantos];

        for(int i = 0; i < quantos; i++){
            System.out.printf("Qual o nome do time ? =>");
            nome = sc.nextLine();
            System.out.printf("Jogador 1:");
            Jogador t1 = criaJogador();
            System.out.printf("Jogador 2:");
            Jogador t2 = criaJogador();
            System.out.printf("Deseja substituto ? (s/n)\n =>");
            subs = sc.nextLine();
            if(Objects.equals(subs, comparaPositivo)){
                Jogador t3 = criaJogador();
                vetor[i] = new Time(t1, t2, t3, nome);
            } else {
                vetor[i] = new Time(t1, t2, nome);
            }
            System.out.println("O time criado foi: ");
            System.out.println(vetor[i].toString());

        }

        //free
        for(Time v: vetor){
            v = null;
        }

    }

    public static Jogador criaJogador(){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        float altura, peso;
        System.out.print("nome do jogador: ");
        nome = sc.nextLine();
        System.out.print("idade do jogador: ");
        idade = sc.nextInt();
        sc.nextLine(); // limpar buffer
        System.out.print("altura do jogador: ");
        altura = (float) sc.nextDouble();
        sc.nextLine(); // limpar buffer
        System.out.print("peso do jogador: ");
        peso = (float) sc.nextDouble();
        sc.nextLine(); // limpar buffer
        Jogador t = new Jogador(nome, idade, altura, peso);
        return t;
    }

}