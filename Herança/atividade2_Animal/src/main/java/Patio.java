public class Patio {

    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Pedro", "Pastor Alemão");
        Gato gato = new Gato("Napoleão", "Exótico");
        cachorro.imprimirAnimal();

        cachorro.caminhar();
        cachorro.late();


        gato.mia();
        gato.caminhar();
        gato.imprimirAnimal();


    }
}
