public class Faculade {
    protected Estudante []matriculados;

    public Faculade(){}

    public void setListaMatriculados(@org.jetbrains.annotations.NotNull Estudante []lista){
        if(lista.length > 100)
            return;

        this.matriculados = lista;
    }
}
