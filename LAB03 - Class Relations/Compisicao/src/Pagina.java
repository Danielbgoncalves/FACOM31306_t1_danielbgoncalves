public class Pagina {
    private int nmrDaPagina;
    private String conteudo;
    private String estado;

    public Pagina(int nmrDaPagina, String conteudo, String estado) {
        this.nmrDaPagina = nmrDaPagina;
        this.conteudo = conteudo;
        this.estado = estado;
    }

    public int getNmrDaPagina() {
        return nmrDaPagina;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "\nPagina{" +
                "nmrDaPagina=" + nmrDaPagina +
                ", conteudo='" + conteudo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
