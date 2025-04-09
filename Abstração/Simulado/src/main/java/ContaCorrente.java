public class ContaCorrente extends ContaBancaria{
   private double limite;
    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
        this.limite = 500;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Você sacou " + saldo + "!");
            System.out.println("Saldo atual: " + saldo);
        } else if(valor > saldo){
            if(valor <= limite){
                limite -= valor;
                System.out.println("Você não tinha saldo suficiente, então" +
                        "o valor que solicitou foi sacado do seu limite!");
                System.out.println("Valor sacado: " + valor);
                System.out.println("Limite atual: " + limite);
            } else {
                System.out.println("Você não tem saldo nem limite para sacar este valor.");
            }
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
}

