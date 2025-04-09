import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class macacoPOO {
    private String nome;
    private List<String> estomago;

    public macacoPOO(String nome){
        this.nome = nome;
        this.estomago = new ArrayList<>();
    }

        public void comer(){
            Scanner s = new Scanner(System.in);
            System.out.println("Qual comida o macaco " + nome + " comerá agora?");
            String comida = s.nextLine();
            estomago.add(comida);
        }
        public void verEstomago(){
            System.out.println("O estômago do macaco " + nome + " está cheio de: " + estomago + "!!");
        }
        public void digerir(){
            estomago.clear();
            System.out.println("A comida foi digerida e agora o estômago está vazio!!");
        }

}
