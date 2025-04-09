import java.util.Scanner;

public class Livro {

    public static void main(String[] args){
        Registro livro = new Registro("1 - 1984", "George Orwell", 326, 3);
        Registro livro2 = new Registro("2 - Revolução dos Bichos", "George Orwell", 112, 3);
        Registro livro3 = new Registro("3 - The America We Deserve", "Donald Trump", 304, 3);


        System.out.println("Bem-vindo a Biblioteca de Springfield!");
        System.out.println("Esses são os livros que nós temos:");
        System.out.println("--------------------------------------------");
        livro.imprimirLivro();
        System.out.println("--------------------------------------------");
        livro2.imprimirLivro();
        System.out.println("--------------------------------------------");
        livro3.imprimirLivro();
        System.out.println("--------------------------------------------");
        Scanner s = new Scanner(System.in);
        System.out.println("Qual livro você gostaria de pegar emprestado?");
        int escolha = s.nextInt();

        Venda venda;
        Registro livroEscolhido;


        switch(escolha){
            case 1:
                venda = new Venda(livro);
                livroEscolhido = livro;
                break;
            case 2:
                venda = new Venda(livro2);
                livroEscolhido = livro2;
                break;
            case 3:
                venda = new Venda(livro3);
                livroEscolhido = livro3;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        venda.emprestimoLivro();

        System.out.println("--------------------------------------------");
        livro.imprimirLivro();
        System.out.println("--------------------------------------------");
        livro2.imprimirLivro();
        System.out.println("--------------------------------------------");
        livro3.imprimirLivro();
        System.out.println("--------------------------------------------");
    }
}
