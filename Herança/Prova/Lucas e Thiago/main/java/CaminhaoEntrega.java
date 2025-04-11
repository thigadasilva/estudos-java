public class CaminhaoEntrega extends VeiculoEntrega{
    private double custo;
    private int capacidadeMaxima;

    public CaminhaoEntrega(String placa){
        this.placa = placa;
        this.custo = 3.0;
        this.capacidadeMaxima = 1000;
    }

    @Override
    public double calcularCustoEntrega(double distancia) {
        double c = custo * distancia;
        return c;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Veículo: Caminhão");
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Custo por litro: " + custo);
        System.out.println("Capacidade máxima: " + capacidadeMaxima);

    }
}
