public class Gato extends Animal{

public Gato(String nome){
    super(nome);
}

    @Override
    protected void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }
}
