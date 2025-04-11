import java.util.ArrayList;

public class VeiculoPOO {

    public static void main(String[] args){

        ArrayList<VeiculoEntrega> veiculos = new ArrayList<>();
        MotoEntrega honda = new MotoEntrega("HH44YY5");
        CarroEntrega byd = new CarroEntrega("HC44OY5");
        CaminhaoEntrega mercedes = new CaminhaoEntrega("HI44YY5");
        veiculos.add(honda);
        veiculos.add(byd);
        veiculos.add(mercedes);

        for (VeiculoEntrega veiculo : veiculos){
            veiculo.exibirInfo();
            System.out.println("Custo da entrega: " + veiculo.calcularCustoEntrega(100) + " litros.\n");
        }
    }
}
