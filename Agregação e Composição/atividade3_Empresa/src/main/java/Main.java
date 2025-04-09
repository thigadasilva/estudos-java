import java.util.List;

public class Main {
    public static void main (String[] args){

        Empresa meta = new Empresa("Meta");

        Funcionario thiago = new Funcionario("Thiago", 10000);
        Funcionario yasmin = new Funcionario("Yasmin", 4500);
        Funcionario sara = new Funcionario("Sara", 13000);

        meta.adicionarFuncionario(thiago);
        meta.adicionarFuncionario(yasmin);
        meta.adicionarFuncionario(sara);

        System.out.println("Empresa: " + meta.getNome());
        for (Funcionario funcionario : meta.getFuncionarios()){
            System.out.println("Funcionario da empresa: " + funcionario.getNome());
            System.out.println("Salário do funcionário: " + funcionario.getSalario());
        }


    }
}
