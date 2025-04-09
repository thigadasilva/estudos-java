public class Quadrado {
    private int lado;

    public Quadrado(int lado){
    this.lado = lado;
    }

    public int getLado(){
    return lado;
    }

    public void setLado(int novoLado){
        lado = novoLado;
    }

    public int calcularArea(){
        return lado * 4;
    }

}
