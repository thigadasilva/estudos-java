public class funcionario {
    /*Crie uma classe Funcionário

A classe deve possuir os atributos nome do tipo String e salario do tipo
double

A classe deve possuir os métodos getNome e setSalario e aumentarSalario
que recebe como parametro um percentualDeAumento

Faça o teste da classe */
    private String nome;
    private double salario;

    public funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = 1512.50;
    }

    public void aumentarSalario(int incremento){
        this.salario += 0.10 * incremento;

    }
    public void getNome(){
        System.out.println("O funcionário " + nome + " não merecia ter ganhado a corrida dos espermatozóides.");
    }
    public void getSalario(){
        System.out.println("Ele recebe " + salario + " por dia! Ele não sabe quantas pessoas gostariam de receber isso.");
    }
}
