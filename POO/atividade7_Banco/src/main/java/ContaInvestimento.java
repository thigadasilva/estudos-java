/*
Faça uma classe ContaInvestimento que seja semelhante a classe
ContaCorrente, com a diferença de que se adicione um atributo taxaJuros.

Forneça um método adicioneJuros() que adicioneJuros a conta.

Em seguida, para testar a classe, escreva um programa que construa uma
contaInvestimento com saldo inicial de 1000 reais e uma taxa de juros de
10%.

Depois aplique o método adicioneJuros() cinco vezes e mostre o saldo
resultante.
*/


public class ContaInvestimento {

    public static void main(String[] args){

        Banco conta = new Banco(10, "Thiago", 1000, 0.10);

        System.out.println("Bem vindo ao Banco Inter! Aqui estão os dados da sua conta:");
        System.out.println("Nome: " + conta.getNomeDoTitular() + " Número da Conta: " + conta.getNumeroDaConta() + " Saldo: " + conta.getSaldo());
        System.out.println("Com juros em uma taxa de: " + conta.getTaxaJuros());

        conta.adicioneJuros();
        conta.adicioneJuros();
        conta.adicioneJuros();
        conta.adicioneJuros();
        conta.adicioneJuros();

        System.out.println("5 meses se passaram! Os juros foram aplicados e o seu saldo agora é: " + conta.getSaldo());


    }
}
