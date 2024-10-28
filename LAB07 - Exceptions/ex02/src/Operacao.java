public class Operacao {


    public Operacao() {

    }

    public double iniciarOperacao(double numerador, double denominador) throws DivisaoPorZeroException {
        if(denominador == 0) throw new DivisaoPorZeroException( "Divisão por zero não é permitida" );

        return  numerador / denominador ;
    }

}
