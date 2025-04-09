import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        ContaBancaria[] contas;
        contas = new ContaBancaria[2];
        System.out.println("Bem-vindo ao Banco Inter!");
        System.out.println("Qual seu nome?");
        Scanner nome = new Scanner(System.in);
        String t = nome.nextLine();

        System.out.println("Qual conta você deseja criar? 1 - Corrente | 2 - Poupança");
        Scanner s = new Scanner(System.in);
        int resposta = s.nextInt();
        switch (resposta){
            case 1:
                ContaCorrente conta = new ContaCorrente(t,0);
                conta.exibirInfo();
                contas[0] = conta;
                break;
            case 2:
                ContaPoupanca conta2 = new ContaPoupanca(t, 0);
                conta2.exibirInfo();
                contas[0] = conta2;
                break;
            default:
                System.out.println("Resposta inválida.");
        }

        System.out.println("O que gostaria de fazer? 1 - Sacar | 2 - Depositar");
        Scanner opcao = new Scanner(System.in);
        int resposta2 = opcao.nextInt();

        switch(resposta2){
            case 1:
                System.out.println("Quanto gostaria de sacar?");
                Scanner sacar = new Scanner(System.in);
                double respostaSacar = sacar.nextDouble();
                contas[0].sacar(respostaSacar);
                break;
            case 2:
                System.out.println("Quanto gostaria de depositar?");
                Scanner depositar = new Scanner(System.in);
                double respostaDepositar = depositar.nextDouble();
                contas[0].depositar(respostaDepositar);
                break;
            default:
                System.out.println("Resposta inválida.");
        }



    }
}
