public class Main {

    public static void main(String[] args){

        DiscoRigido tres = new DiscoRigido("HD", 1000);
        Memoria dois = new Memoria(16);
        Processador um = new Processador("Ryzen", 10000);

        Computador pichau = new Computador(um, dois, tres);

        System.out.println(um.getNome());
        System.out.println(dois.getCapacidade());
        System.out.println(tres.getTipo() + tres.getCapacidade());

    }
}
