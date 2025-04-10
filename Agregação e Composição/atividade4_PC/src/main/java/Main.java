public class main {

    public static void main(String[] args){

                DiscoRigido tres = new DiscoRigido("HD", 1000);
                Memoria dois = new Memoria(16);
                Processador um = new Processador("Ryzen", 10000);

                Computador pichau = new Computador(um, dois, tres);

                System.out.println(pichau.getProcessador().getNome());
                System.out.println(pichau.getDiscoRigido().getCapacidade() + pichau.getDiscoRigido().getTipo());
                System.out.println(pichau.getMemoria().getCapacidade());

    }
}
