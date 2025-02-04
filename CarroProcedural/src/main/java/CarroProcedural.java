public class CarroProcedural {

    public static int acelerar(int velocidadeAtual, int incremento){
        return velocidadeAtual + incremento;
    }

    public static void main(String[] args){
        String modelo = "Fusca";
        int velocidade = 0;

        velocidade = acelerar(velocidade,20);
        System.out.println("O " + modelo + " está a " + velocidade + " Km/n ");
    }
}
