public class Onibus extends Veiculo {

    public Onibus(String modelo, int capacidadePassageiros, double consumoCombustivel){
        super(modelo, capacidadePassageiros, consumoCombustivel);
    }

    @Override
    protected void mover() {

        System.out.println("O Ônibus está se movendo pela cidade.");
    }
}
