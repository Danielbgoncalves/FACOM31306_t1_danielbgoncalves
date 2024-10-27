public class Faculade {
    protected Estudante []matriculados;
    protected Estudante []matriculadosPosGrad;

    public Faculade(){}

    public void setListaMatriculados(Estudante []mainList ){
        if(mainList.length > 100)
            return;

        this.matriculados = mainList;
        this.matriculadosPosGrad = new EstudantePosGrad[100];
    }

    public int qntEstudantes(){
        int k = 0;
        for(int i = 0; i < matriculados.length; i ++){
            if(matriculados[i] != null) k++;
            else break;
        }
        return k;
    }

    public void printaPosGrad(EstudantePosGrad[] alunosDePosGrad){
        int k = 0;
        for(int i = 0; i < matriculados.length; i ++){
            if(matriculados[i] instanceof EstudantePosGrad){
                matriculadosPosGrad[k] = matriculados[i];
                k++;
            }
        }
        for(Estudante elemento: matriculadosPosGrad ){
            elemento.print();
        }
    }



}
