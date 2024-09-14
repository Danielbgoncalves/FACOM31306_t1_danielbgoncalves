import java.util.Scanner;
//import java.util.Locale; se fosse usar o scanner com ponto

class Numero{
    int valor;
    int posicao;

    //Constructor
    Numero(int valor, int posicao){
        this.valor = valor;
        this.posicao = posicao;
    }
}

class  vetorLimitado{
    int tamanho;
    int[] vetor = new int[5];

    //Constructor
    vetorLimitado(int tamanho, int[] vetor){
        this.tamanho = tamanho;
        this.vetor = vetor;
    }
}

class vetorBolinhas{
    int posicaoDoMaior;
    int[] vetor;
    float[] vetorPorcentagem = new float[4];
    int somaDasQntBolinhas;
    int maiorValor;
    String[] cores = {"Verde", "Azul", "Amarela", "Vermelha"};

    //Constructor
    vetorBolinhas(int posicaoDoMaior, int[] vetor,int maiorValor,  int somaDasQntBolinhas){
        this.posicaoDoMaior = posicaoDoMaior;
        this.vetor = vetor;
        this.maiorValor = maiorValor;
        this.somaDasQntBolinhas = somaDasQntBolinhas;
    }

    void lerQuantidadeDeBolas(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < this.vetor.length; i++){
            System.out.print(this.cores[i] + ": ");
            this.vetor[i] = sc.nextInt();
            if(this.vetor[i] > this.maiorValor){
                this.maiorValor = this.vetor[i];
                this.posicaoDoMaior = i;
            }
            this.somaDasQntBolinhas += this.vetor[i];
        }
        sc.close();
    }

    void normaliza(){
        float normalizador;
        normalizador = (float) 100/this.somaDasQntBolinhas;

        for(int i = 0; i < this.vetor.length; i++)
            this.vetorPorcentagem[i] = (float)this.vetor[i] * normalizador;

    }


    void printa(){
        System.out.print("\nProbabilidades\n");
        for(int i = 0; i < this.vetor.length; i++){
            System.out.printf("%s: %.1f%s",this.cores[i], this.vetorPorcentagem[i], "%");
            if(posicaoDoMaior == i) System.out.print("<< Maior probabilidade \n");
            else System.out.print("\n");
        }

    }

}

class Aluno{
    int matricula;
    char classeSocial;
    float CRA;
    Aluno(int matricula, char classeSocial, float CRA){
        this.matricula = matricula;
        this.classeSocial = classeSocial;
        this.CRA = CRA;
    }

    void printa(){
        System.out.printf("Matrícula: %d Classe Social: %c CRA: %.2f \n", this.matricula, this.classeSocial, this.CRA);
    }

}

class Num{
    int valor;
    int nmrRepeticoes;

    Num(int valor, int nmrRepeticoes){
        this.valor = valor;
        this.nmrRepeticoes = nmrRepeticoes;
    }

}


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
           // System.out.printf("\n");

            if(var % 2 == 0){
                vet[i] = var;
                i++;
            } else{
                System.out.printf("valor inválido \n");
            }
            if( i == 6) break;
        }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.printf("<<5 valores>> \n");
        for( int i = 0; i < 5; i++){
            System.out.printf("Entre com um número: ");
            valores[i] = sc.nextInt();
        }

        int maior = 0;
        int menor = 0;
        float media = 0;

        System.out.printf("Os números digitados são: ");
        for(int i = 0; i < 5; i++){
            if(valores[i] > maior) maior = valores[i];
            if(valores[i] < menor) menor = valores[i];
            media += valores[i];
            System.out.printf("%d ", valores[i]);
        }

        System.out.printf("\nO maior valor é: %d\n", maior );
        System.out.printf("O menor valor é: %d\n", menor );
        System.out.printf("A média é: %.1f", media/valores.length );
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.printf("<<5 valores>> \n");
        for( int i = 0; i < 5; i++){
            System.out.printf("Entre com um número: ");
            valores[i] = sc.nextInt();
        }

        Numero maior = new Numero(valores[0],0 );
        Numero menor = new Numero(valores[0],0 );
        float media = 0;

        System.out.printf("Os números digitados são: ");
        for(int i = 0; i < 5; i++){
            if(valores[i] > maior.valor){
                maior.valor = valores[i];
                maior.posicao = i;
            }
            if(valores[i] < menor.valor){
                menor.valor = valores[i];
                menor.posicao = i;
            }
            media += valores[i];
            System.out.printf("%d ", valores[i]);
        }

        System.out.printf("\nO maior valor é: %d, localizado na posição %d do vetor\n", maior.valor, maior.posicao );
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n", menor.valor, menor.posicao );
        System.out.printf("A média é: %.1f", media/valores.length );

    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        //sc.useLocale(Locale.US); se quisesse usar o ponto para separação decimal

        float[] vetNotas = new float[5];
        float maiorNota = 0; // Impossível ter nota negativa ne, por favor!

        System.out.printf("<<Normalizando as notas>>\n");

        for(int i = 0; i < 5; i++){ // recebe as notas e define a maior
            System.out.printf("Entre com a nota do aluno %d: ", i);
            vetNotas[i] = sc.nextFloat();
            if(vetNotas[i] > maiorNota) maiorNota = vetNotas[i];
        }

        float normalizador = 100/maiorNota;

        for(int i = 0; i < 5; i++){ // normaliza as notas do vetor
            vetNotas[i] = vetNotas[i] * normalizador;
        }

        System.out.printf("\nNotas normalizadas\n\n");

        for(int i = 0; i < 5; i++){
            System.out.printf("Nota do aluno %d é %.2f\n", i, vetNotas[i]);
        }



    }

    public static void ex08() {
        int[] valores = new int[5];
        int media = 0;
        double somatorioNormalizado = 0;
        double desvioPadraoAoQuadrado;
        double desvioPadrao;
        Scanner sc = new Scanner(System.in);

        System.out.printf("<< Média e desvio-padrão >> \n");

        // Recebe os valores
        for( int i = 0; i < 5; i++){
            System.out.printf("Digite o valor: ");
            valores[i] = sc.nextInt();
        }

        // Calcula média
        for(int i = 0; i < 5; i++){
            media += valores[i];
        }
        media /= valores.length;

        // Calcula o somatorio Dos Quadrados da Diferenças (acho q é isso kk)
        for(int i = 0; i < 5; i++){
            somatorioNormalizado += Math.pow(valores[i] - media,2);
        }
        desvioPadraoAoQuadrado = somatorioNormalizado / (valores.length - 1);
        desvioPadrao = Math.sqrt(desvioPadraoAoQuadrado);

        System.out.printf("A média é %d e o desvio-padrão é %.13f", media, desvioPadrao);

    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        Boolean qtdValidaDeAluno = false;
        int nmrAlunos = 0;
        int somatorioNotas = 0;
        float media;


        System.out.printf("<< Média de n alunos. Máximo 100 alunos >> \n");
        
        while(!qtdValidaDeAluno){
            System.out.printf("Entre com o números de alunos: ");
            nmrAlunos = sc.nextInt();

            if(nmrAlunos < 100) qtdValidaDeAluno = true;
            System.out.printf("\nO número de alunos deve ser menor que 100. Tente novamente: \n");

        }

        int[] vetNotas = new int[nmrAlunos];

        for(int i = 0; i < nmrAlunos; i++){
            System.out.printf("Digite a nota do aluno %d: ", i+1);
            vetNotas[i] = sc.nextInt();
        }

        for(int i = 0; i < nmrAlunos; i++){
            System.out.printf("A nota do aluno %d é: %d\n", i+1, vetNotas[i] );
            somatorioNotas += vetNotas[i];
        }

        media = somatorioNotas / (float)vetNotas.length; // para garantir o retorno com a parte fracionária
        System.out.printf("A média da turma: %.2f", media );

    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[3];
        int[] vetB = new int[3];
        int[] vetC = new int[3];

        System.out.printf("<< Subtração de vetores >>\n");

        for(int i = 0 ; i < 3; i++){
            System.out.printf("Digite o valor %d de A: ", i+1);
            vetA[i] = sc.nextInt();
        }
        System.out.printf("\n");

        for(int i = 0 ; i < 3; i++){
            System.out.printf("Digite o valor %d de B: ", i+1);
            vetB[i] = sc.nextInt();
        }

        for(int i = 0 ; i < 3; i++) {
            vetC[i] = vetA[i] - vetB[i];
        }

        System.out.printf("O vetor C, definido como C = A-B é (%d, %d, %d)", vetC[0], vetC[1], vetC[2]);

    }

    public static void ex11(){

        Scanner sc =  new Scanner(System.in);
        int[] v = new int[5];
        int[] vet1_0 = new int[5];
        vetorLimitado v1 = new vetorLimitado(0, vet1_0);
        int[] vet2_0 = new int[5];
        vetorLimitado v2 = new vetorLimitado(0, vet2_0);

        System.out.printf("<< Pares e Ímpares >>\n");

        for(int i = 0; i < v.length; i++){
            System.out.printf("Digite o valor: ");
            v[i] = sc.nextInt();
        }

        for(int i = 0; i < v.length; i++){
            if(v[i] % 2 == 0){
                v2.vetor[v2.tamanho] = v[i];
                v2.tamanho++;
            } else {
                v1.vetor[v1.tamanho] = v[i];
                v1.tamanho++;
            }
        }

        System.out.printf("Ímpares: ");
        for(int i = 0; i < v1.tamanho; i++){
            System.out.printf(v1.vetor[i] + " ");
        }

        System.out.printf("\nPares: ");
        for(int i = 0; i < v2.tamanho; i++){
            System.out.printf(v2.vetor[i] + " ");
        }

    }

    public static void ex12(){

        int[] vetBolinhas = new int[4];
        vetorBolinhas vet = new vetorBolinhas(0, vetBolinhas, 0, 0);

        System.out.println("<< Probabilidades >>");
        System.out.println("Digite a quantidade de bolinhas");

        vet.lerQuantidadeDeBolas();
        vet.normaliza();
        vet.printa();


    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int temp;

        for(int i = 0; i < 5; i++){
            System.out.printf("Enter com o nuemro %d: ", i+1);
            temp = sc.nextInt();
            if(temp < 0) vet[i] = 0;
            else vet[i] = temp;
        }

        System.out.print("\nZerando os negativos obtém-se: ");
        for(int i = 0; i < 5; i++){
            System.out.print(vet[i] + " ");
        }
    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int numAlunos = 0;
        boolean numAlunoAceitavel = false;
        int matricula;
        char classeSocial;
        float CRA;

        System.out.print("<< Universidade X >>\n" + "Quantos alunos serão cadastrados: ");
        while(!numAlunoAceitavel){
            numAlunos = sc.nextInt();

            if(numAlunos > 0 && numAlunos < 10000) numAlunoAceitavel = true;
        }

        Aluno[] vetorAlunos = new Aluno[numAlunos];

        for(int i = 0; i < numAlunos; i++){
            System.out.print("\nEntre com o número do aluno: ");
            matricula = sc.nextInt();
            System.out.printf("Entre com a classe social do aluno %d: ", matricula);
            classeSocial = sc.next().charAt(0);
            System.out.printf("Entre com o CRA do aluno %d: ", matricula);
            CRA = sc.nextFloat();

            Aluno alunoAtual = new Aluno(matricula, classeSocial, CRA);
            vetorAlunos[i] = alunoAtual;
        }

        System.out.print("\n==== Alunos Cadastrados ====\n");
        for(int i = 0; i < numAlunos; i++){
            vetorAlunos[i].printa();
        }

        sc.close();
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] rep = new int[7];
        int pos = 0;

        System.out.println("<< Valores iguais >>");
        for(int i =  0; i < 8; i++ ){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
        }

        for(int i =  0; i < 7; i++ ){
            for(int j =  i+1; j < 8; j++ ){
                if(vet[i] == vet[j]){
                    rep[pos] = vet[i];
                    pos++;
                }
            }
        }

        System.out.print("Valores repetidos: ");
        for(int i =  0; i < pos; i++){
            System.out.print(rep[i] + " ");
        }
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);

        Num[] vet = new Num[8];
       // Num[] vetFinal = new Num[7];
        int posRep;
        int pos = 0;

        System.out.println("<< Valores iguais >>");

        for(int i =  0; i < 8; i++ ){
            System.out.printf("Entre com o número %d: ", i+1);
            int valor = sc.nextInt();
            posRep = jaTemNoVetor(vet, valor);

            if(posRep != 9){
                vet[posRep].nmrRepeticoes++;
            } else {
                Num numero = new Num(valor, 1);
                vet[pos] = numero;
                pos++;
            }
        }

        System.out.println("\nValores repetidos: ");
        for(int i =  0; i < vet.length && vet[i] != null; i++){
            if(vet[i].nmrRepeticoes > 1){
                System.out.printf("%d aparece %d vezes \n", vet[i].valor, vet[i].nmrRepeticoes );
            }
        }

    }

    public static int jaTemNoVetor(Num[] vet, int valor){
        for(int i = 0; i < vet.length; i++){
            if( vet[i] != null ){
                if(valor == vet[i].valor){
                    return i;
                }
            }

        }
        return 9;
    }


    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        ex16();
    }




}
