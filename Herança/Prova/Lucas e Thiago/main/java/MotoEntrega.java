public class MotoEntrega extends VeiculoEntrega{
    private double custo;
    private int capacidadeMaxima;

    public MotoEntrega(String placa){
        this.placa = placa;
        this.custo = 1.50;
        this.capacidadeMaxima = 50;
    }

    @Override
    public double calcularCustoEntrega(double distancia) {
        double a = custo * distancia;
        return a;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Moto");
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Custo por litro: " + custo);
        System.out.println("Capacidade máxima: " + capacidadeMaxima);
    }
}
