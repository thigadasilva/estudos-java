public class Carro extends Veiculo{

    public Carro(String modelo, int capacidadePassageiros, double consumoCombustivel){
        super(modelo, capacidadePassageiros, consumoCombustivel);
    }

    @Override
    protected void mover() {
        System.out.println("O carro está se movendo na estrada.");
    }
}
