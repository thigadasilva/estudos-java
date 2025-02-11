import java.util.Scanner;


public class AlimentoPOO {

    private String nome;
    private double kcal;

    public AlimentoPOO(){
        this.nome = nome;
        this.kcal = 0;
    }

    public void getNome(){
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o nome do seu alimento?");
        nome = s.nextLine();
    }
    public void setNome(){
        Scanner s = new Scanner(System.in);
        System.out.println("Você deseja trocar de alimento?");
        String resposta = s.nextLine();
        if(resposta.equals("Sim")){
            Scanner x = new Scanner(System.in);
            System.out.println("Qual o nome do seu alimento?");
            nome = x.nextLine();
        } else{
            System.out.println("Ok.");
        }
    }

    public double getKcal(){
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas calorias o seu alimento tem?");
        kcal = s.nextDouble();
        return kcal;
    }
    public double setKcal(){
        Scanner s = new Scanner(System.in);
        System.out.println("Você tem certeza que informou as calorias corretas?");
        double resposta = s.nextDouble();
        if(resposta == 1){
            Scanner x = new Scanner(System.in);
            System.out.println("Informe o valor exato de calorias do seu alimento:");
            kcal = x.nextDouble();
        } else{
            System.out.println("Ok.");
        }
        return kcal;
    }
    public String toString() {
        return "AlimentoPOO{" +
                "nome='" + nome + '\'' +
                ", kcal=" + kcal +
                '}';
    }
}
