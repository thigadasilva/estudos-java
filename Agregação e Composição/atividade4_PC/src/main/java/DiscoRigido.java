public class DiscoRigido {
    private String tipo;
    private int capacidade;

    public DiscoRigido(String tipo, int capacidade){
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
