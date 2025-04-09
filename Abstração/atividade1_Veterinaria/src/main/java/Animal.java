public abstract class Animal {
    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    protected abstract void emitirSom();

    protected void dormir(){
        System.out.println("O animal está dormindo.");
    }
}
