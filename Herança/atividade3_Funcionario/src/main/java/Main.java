import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){


        System.out.println("Bem vindo a nossa empresa!");

       Scanner s = new Scanner(System.in);

       System.out.println("Qual é o seu cargo? 1 - Gerente | 2 - Vendedor | 3 - Estagiario");
       int emprego = s.nextInt();

       if (emprego == 1){
           Gerente pessoa = new Gerente("Funcionário 01", "Gerente", 7000);
           pessoa.imprimirDetalhes();
       } else if (emprego == 2){
           Vendedor pessoa = new Vendedor("Funcionário 01", "Vendedor", 4500);
           pessoa.imprimirDetalhes();
       } else if(emprego == 3){
           Estagiario pessoa = new Estagiario("Funcionário 01", "Estagiário", 2500);
           pessoa.imprimirDetalhes();
       }
    }
}
