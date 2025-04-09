
public class Main {

    public static void main(String[] args){

        Universidade harvard = new Universidade();

        Departamento departamento1 = new Departamento("Departamento de Lugar Nenhum");
        Departamento departamento2 = new Departamento("Departamento de Todo Lugar");

        harvard.adicionarDepartamentos(departamento1);
        harvard.adicionarDepartamentos(departamento2);

        Professor erick = new Professor("Erick Matheus");
        Professor victor = new Professor("Victor Rafael");
        Professor darlan = new Professor("Darlan");

        departamento1.adicionarProfessor(erick);
        departamento1.adicionarProfessor(victor);
        departamento2.adicionarProfessor(darlan);

        System.out.println("Universidade: ");
        for(Departamento departamento : harvard.getDepartamentos()){
            System.out.println("Departamento: " + departamento.getNome());
            for(Professor professor : departamento.getProfessores()){
                System.out.println("Professor: " + professor.getNome());
            }
        }
    }
}
