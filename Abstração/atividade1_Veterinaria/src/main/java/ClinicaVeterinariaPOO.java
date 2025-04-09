public class ClinicaVeterinariaPOO {

    public static void main(String[] args){

        Gato spike = new Gato("Spike");
        Cachorro ice = new Cachorro("Ice");

        spike.emitirSom();
        spike.dormir();
        ice.emitirSom();
        ice.dormir();

    }
}
