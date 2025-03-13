import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    Samsung telefone = new Samsung("S24 Ultra", 16, 256, 8000);
    Apple telefone2 = new Apple("IPhone 16", 16, 256, 15000);
    Motorola telefone3 = new Motorola("Edge 50 Ultra", 16, 256, 10000);

    System.out.println("Bem vindo a loja de telefones!");
    telefone.imprimirLoja();
    Scanner s = new Scanner(System.in);
    System.out.println("Qual você deseja comprar?");
    int escolha = s.nextInt();

    switch(escolha){
        case 1:
        telefone.imprimirDetalhes();
        telefone.detalhesSamsung();
        System.out.println("Você comprou este telefone!");
        break;
        case 2:
        telefone2.imprimirDetalhes();
        telefone2.detalhesApple();
        System.out.println("Você comprou este telefone!");
        break;
        case 3:
        telefone3.imprimirDetalhes();
        telefone3.detalhesMotorola();
        System.out.println("Você comprou este telefone!");
        break;
        default:
            System.out.println("Opção inválida!");
    }
}
}
