public class Fabrica {

    private int combustivel;
    private int consumo;

    public Fabrica(int combustivel, int consumo){
        this.combustivel = combustivel;
        this.consumo = consumo;
    }

    public int getCombustivel(){
        return combustivel;
    }
    public void setCombustivel(int combustivel){
        this.combustivel = combustivel;
    }
    public int getConsumo(){
        return consumo;
    }
    public void setConsumo(int consumo){
        this.consumo = consumo;
    }

    public void andar(int distancia){
        combustivel = combustivel - distancia;
    }
    public void abastecer(int quantidade){
        combustivel = combustivel + quantidade;
    }


}
