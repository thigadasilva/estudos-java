public class Banco{

    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;
    private double taxaJuros;

    public Banco(int numeroDaConta, String nomeDoTitular, int saldo, double taxaJuros){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }
    public String getNomeDoTitular(){
        return nomeDoTitular;
    }
    public void setNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular = nomeDoTitular;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
    this.saldo = saldo;
    }
    public double getTaxaJuros(){
        return taxaJuros;
    }
    public void setTaxaJuros(int taxaJuros){
        this.taxaJuros = taxaJuros;
    }

    public void depositar(int valor){
        saldo += valor;
    }
    public void sacar(int valor){
       saldo -= valor;
    }
    public void adicioneJuros(){
        double v = saldo * 0.10;
        saldo += v;
    }




}
