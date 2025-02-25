public class Lamborghini {

    public static void main(String[] args){
        Fabrica lambo = new Fabrica(40, 4);
        System.out.println("Opa! sua lamborghini tá com o tanque cheio! Litros no tanque: " + lambo.getCombustivel());
        System.out.println("O consumo do seu carro é: " + lambo.getConsumo());

        System.out.println("Você andou de lamborghini por 10 kilômetros");
        lambo.andar(10);
        System.out.println("O tanque agora está com: " + lambo.getCombustivel());
        System.out.println("Você abasteceu a lamborghini com 10 litros de etanol!");
        lambo.abastecer(10);
        System.out.println("O seu tanque agora está com " + lambo.getCombustivel());
    }
}
