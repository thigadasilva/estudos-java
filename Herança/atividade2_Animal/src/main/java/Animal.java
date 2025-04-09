public class Animal {
    protected String nome;
    protected String raca;

    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    public void imprimirAnimal(){
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
    }

    public void caminhar(){
        System.out.println("Seu animal caminhou por 5 metros!");
    }



}
