public class Celular {
    protected String modelo;
    protected int ram;
    protected int memoria;
    protected int preco;


    public Celular(String modelo, int ram, int memoria, int preco){
        this.modelo = modelo;
        this.ram = ram;
        this.memoria = memoria;
        this.preco = preco;
    }

    public String getModelo(){
        return modelo;
    }
    public int getPreco(){
        return preco;
    }
    public int getRam(){
        return ram;
    }
    public int getMemoria(){
        return memoria;
    }
    public void setModelo(String Modelo){
        this.modelo = modelo;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }

    public void imprimirDetalhes(){
        System.out.println("Modelo do telefone: " + modelo);
        System.out.println("Memória RAM: " + ram);
        System.out.println("Memória de armazenamento: " + memoria);
        System.out.println("Preço do telefone: " + preco);
    }

    public void imprimirLoja(){
        System.out.println("Telefones disponíveis na loja:");
        System.out.println("1 - Samsung S24 Ultra | 2 - IPhone 16 | 3 - Motorola Edge 50 Ultra");
    }
}
