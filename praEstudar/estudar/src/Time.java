public class Time {
    private Jogador titular1;
    private Jogador titular2;
    private Jogador substituto;
    private String nome;

    public Time(Jogador titular1, Jogador tutular2, Jogador substituto, String nomeTime) {
        this.titular1 = new Jogador(titular1.getNome(), titular1.getIdade(), titular1.getAltura(), titular1.getPeso());
        this.titular2 = new Jogador(titular2.getNome(), titular2.getIdade(), titular2.getAltura(), titular2.getPeso());
        this.substituto = new Jogador(substituto.getNome(), substituto.getIdade(), substituto.getAltura(), substituto.getPeso());
        this.nome = nomeTime;
    }

    public Time(Jogador titular1, Jogador titular2, String nomeTime) {
        this.titular1 = new Jogador(titular1.getNome(), titular1.getIdade(), titular1.getAltura(),titular1.getPeso());
        this.titular2 = new Jogador(titular2.getNome(), titular2.getIdade(), titular2.getAltura(),titular2.getPeso());
        this.substituto = null;
        this.nome = nomeTime;
    }

    @Override
    public String toString() {
        if(this.substituto != null){
            return "Time{" +
                    "titular1=" + titular1.toString() +
                    ", titular2=" + titular2.toString() +
                    ", substituto=" + substituto.toString() +
                    ", nome='" + nome + '\'' +
                    '}';
        } else {
            return "Time{" +
                    "titular1=" + titular1.toString() +
                    ", titular2=" + titular2.toString() +
                    ", nome='" + nome + '\'' +
                    '}';
        }
    }

    public float idadeMedia(){
        float qnt = 2.0F;
        int somaIdades = this.titular1.getIdade() + this.titular2.getIdade();
        if(this.substituto != null){
            somaIdades += this.substituto.getIdade();
            qnt = 3.0F;
        }
        return somaIdades/qnt;
    }


}
