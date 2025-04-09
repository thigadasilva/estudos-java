public class ContaPoupanca extends ContaBancaria{
    private double bonus;
    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
        this.bonus = 0.005;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    @Override
    public void depositar(double valor) {
        bonus *= valor;
        super.depositar(valor + bonus);
    }
}
