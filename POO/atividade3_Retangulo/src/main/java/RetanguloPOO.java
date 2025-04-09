public class RetanguloPOO {

    public static void main(String[] args){
        Retangulo retangulo1 = new Retangulo(400, 120);
        System.out.println("A base do retangulo é: " + retangulo1.getBase());
        System.out.println("A altura do retangulo é: " + retangulo1.getAltura());

        retangulo1.setBase(300);
        retangulo1.setAltura(700);

        System.out.println("Valores trocados! Novos valores; Base: " + retangulo1.getBase() + " Altura: " + retangulo1.getAltura());

        System.out.println("A área do retângulo é: " + retangulo1.calcularArea());
        System.out.println("O perímetro do retângulo é: " + retangulo1.calcularPerimetro());
    }
}
