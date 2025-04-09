import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Professor> professores;

    public Departamento(String nome){
        this.nome = nome;
        professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }
    public List<Professor> getProfessores(){
        return professores;
    }
    public String getNome(){
        return nome;
    }

}
