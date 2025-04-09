import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Fiat Uno", 4, 24));
        veiculos.add(new Onibus("Mercedes", 50, 10));
        veiculos.add(new Aviao("Jatinho", 20, 4));

      for(Veiculo veiculo : veiculos){
            veiculo.mover();
            veiculo.exibirInfo();
      }

    }
}
