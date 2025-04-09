public abstract class Veiculo {
    protected String modelo;
    protected int capacidadePassageiros;
    protected double consumoCombustivel;

    public Veiculo(String modelo, int capacidadePassageiros, double consumoCombustivel){
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.consumoCombustivel = consumoCombustivel;
    }

    protected abstract void mover();

    protected void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade total: " + capacidadePassageiros);
        System.out.println("Combustivel por litro: " + consumoCombustivel);
    }
}
