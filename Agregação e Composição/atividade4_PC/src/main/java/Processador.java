public class Processador {
    private int velocidade;
    private String nome;

    public Processador(String nome, int velocidade){
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
