import java.util.Scanner;

public class faceFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoContato, apelido, nome, email, aniversario, parentesco, grau, tipo;
        Contatos []seguindo = new Contatos[10];
        int k, pos = 0;
        char op;
        do{
            System.out.print("\n============= Menu =============\n" +
                    "a: Inserir um contato\nb: Imprimir todos os contatos\n" +
                    "c: Imprimir somente os familiares\nd: Imprimir somente os amigos\n" +
                    "e: Imprimir somente os colegas de trabalho\nf: Imprimir só os tops\n" +
                    "g: Imprimir seguidor de posição específica\nh: Sair\n=> ");
            op = sc.next().charAt(0);
            sc.nextLine();  // Limpa o buffer para evitar problemas com o próximo nextLine()


            switch (op){
                case 'a':
                    System.out.print("Qual o tipo de contado ?\n=> ");
                    tipoContato = sc.nextLine();
                    System.out.print("Apelido\n=> ");
                    apelido = sc.nextLine();
                    System.out.print("Nome\n=> ");
                    nome = sc.nextLine();
                    System.out.print("email \n=>");
                    email = sc.nextLine();
                    System.out.print("Aniverssário\n=>");
                    aniversario = sc.nextLine();

                    if(tipoContato.equals("Familia")){
                        System.out.print("Parentesco\n=>");
                        parentesco = sc.nextLine();
                        seguindo[pos] = new Familia(apelido, nome, email, aniversario, parentesco);
                    } else if(tipoContato.equals("Amigo")){
                        System.out.print("Grau de Amizade\n=>");
                        grau = sc.nextLine();
                        try {seguindo[pos] = new Amigo(apelido, nome, email, aniversario, grau);}
                        catch (RuntimeException e){
                            System.out.println("O grau de amizade deve ser string do tipo '1' ou '2' ou '3' ");
                            pos--;
                        }
                    } else if(tipoContato.equals("Trabalho")){
                        System.out.print("Tipo de colega de trabalho\n=>");
                        tipo = sc.nextLine();
                        seguindo[pos] = new Trabalho(apelido, nome, email, aniversario, tipo);
                    }

                    pos++;
                    break;

                case 'b':
                    for(Contatos s: seguindo )
                        if(s != null) System.out.print(s.imprimirContato());
                    break;
                case 'c':
                    for(Contatos s: seguindo )
                        if(s != null && s instanceof Familia) System.out.print(s.imprimirContato());
                    break;
                case 'd':
                    for(Contatos s: seguindo )
                        if(s != null && s instanceof Amigo) System.out.print(s.imprimirContato());
                    break;
                case 'e':
                    for(Contatos s: seguindo )
                        if(s != null && s instanceof Trabalho) System.out.print(s.imprimirContato());
                    break;
                case 'f':
                    for(Contatos s: seguindo ){
                        if(s != null){
                            if(s instanceof Amigo && (((Amigo) s).getGrau().equals("1"))) System.out.print(s.imprimirContato());
                            if(s instanceof Familia && (((Familia) s).getParentesco().equals("Irmão"))) System.out.print(s.imprimirContato());
                            if(s instanceof Trabalho && (((Trabalho) s).getTipo().equals("Colega"))) System.out.print(s.imprimirContato());

                        }
                    }
                    break;
                case 'g':
                    System.out.println("Qual a posição ?\n=>");
                    try{
                        k = sc.nextInt();
                        System.out.print(seguindo[k].imprimirContato());
                    } catch (Exception e){
                        System.out.println("Erro, tente onvamente");
                    }
                    break;
                case 'h':
                    System.out.println("Encerrando o programa...");
                    System.out.println("Instalando virus mortal...");
                    System.out.println("Roubando seus dados...");
                    System.out.println("Obrigado por usar nosso sistema");
            }

        }while(op != 'h');
    }
}