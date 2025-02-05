public class ControlePOO {

    public static void main(String[] args){
        Controle controle1 = new Controle(11, 50);
        System.out.println("O número do canal de Tv agora é: " + controle1.getCanal());
        System.out.println("O volume da Tv no momento é: " + controle1.getVolume());

        controle1.setCanal(7);

        System.out.println("Você mudou de canal para a Band! Número do canal de Tv agora é: " + controle1.getCanal());
        System.out.println("Você também aumentou o volume! O volume da Tv agora é: " + controle1.aumentarVolume());

        System.out.println("Você percebeu que estava muito alto, então diminuiu denovo! O volume da Tv agora é: " + controle1.diminuirVolume());
    }
}
