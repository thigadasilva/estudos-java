public abstract class ContaBancaria {

    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public double saldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("O valor: " + valor + " foi incrementado na sua conta! Saldo atual:" + saldo);
    }
    public abstract void sacar(double valor);
    public abstract void exibirInfo();
}
