import java.util.Scanner;

public class Main{


public static void main(String[] args) {

    Macaco diego = new Macaco();

    Scanner diego2 = new Scanner(System.in);
    System.out.println("Digite um número: ");
    double a = diego2.nextDouble();
    System.out.println("Digite outro número: ");
    double b = diego2.nextDouble();
    System.out.println(diego.somar(a, b));
    diego2.close();



}
}
