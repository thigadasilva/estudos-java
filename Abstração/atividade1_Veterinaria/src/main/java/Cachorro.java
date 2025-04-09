public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    protected void emitirSom() {
        System.out.println("O cachorro faz: Au! Au!");
    }
}
