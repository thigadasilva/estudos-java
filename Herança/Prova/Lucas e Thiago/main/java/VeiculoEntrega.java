public abstract class VeiculoEntrega {
    protected String placa;
    protected double capacidadeCarga;

    public abstract double calcularCustoEntrega(double distancia);
    public abstract void exibirInfo();
}
