public class Carro {
    private String modelo;
    private int velocidade;

    public Carro (String modelo){
        this.modelo = modelo;
        this.velocidade = 0;
    }
    public void acelerar(int incremento){
        this.velocidade += incremento;
    }
    public void mostraVelocidade(){
        System.out.println("O " + modelo + " está a " + velocidade + " km/h");
    }
}
