import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private List<Departamento> departamentos;

    public Universidade(){
        departamentos = new ArrayList<>();
    }
    public void adicionarDepartamentos(Departamento departamento){
        departamentos.add(departamento);
    }
    public List<Departamento> getDepartamentos(){
        return departamentos;
    }
}
