import java.util.List;
import java.util.ArrayList;

public class Empresa {

    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome){
        this.nome = nome;
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
