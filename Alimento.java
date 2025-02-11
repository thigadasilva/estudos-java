public class Alimento {

    public static void main(String[] args){
        AlimentoPOO alimento1 = new AlimentoPOO();

        alimento1.getNome();
        alimento1.setNome();
        alimento1.getKcal();
        alimento1.setKcal();

        System.out.println(alimento1.toString());
    }
}
