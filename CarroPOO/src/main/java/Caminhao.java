public class Caminhao {
    private String modelo2;
    private int velocidade2;

    public Caminhao(String modelo2) {
        this.modelo2 = modelo2;
        this.velocidade2 = 0;
    }

    public void acelerarC(int incremento2) {
        this.velocidade2 += incremento2;
    }

    public void mostraVelocidadeC() {
        System.out.println("O " + modelo2 + " está a " + velocidade2 + " km/h");
    }
}
