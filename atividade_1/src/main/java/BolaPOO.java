public class BolaPOO {

    public static void main(String[] args){
        Bola bola1 = new Bola("roxo");
        System.out.print("A bola é da cor: " + bola1.getCor() + "\n");
        bola1.setCor("verde");
        System.out.println("A bola agora está da cor: " + bola1.getCor());
    }
}
