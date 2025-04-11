public class CarroEntrega extends VeiculoEntrega{
    private double custo;
    private int capacidadeMaxima;

    public CarroEntrega(String placa){
        this.placa = placa;
        this.custo = 2.00;
        this.capacidadeMaxima = 200;
    }

    @Override
    public double calcularCustoEntrega(double distancia) {
        double b = custo * distancia;
        return b;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Carro");
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Custo por litro: " + custo);
        System.out.println("Capacidade máxima: " + capacidadeMaxima);
    }
}
