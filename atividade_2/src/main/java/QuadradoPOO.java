public class QuadradoPOO {

    public static void main(String[] args){
        Quadrado quadrado1 = new Quadrado(250);
        System.out.println("O lado direito do quadrado tem: " + quadrado1.getLado() + " cm de comprimento.\n");
        quadrado1.setLado(777);
        System.out.println("O lado direito agora tem: " + quadrado1.getLado() + " cm de comprimento.\n");
        System.out.println("A área do quadrado é de: " + quadrado1.calcularArea() + " cm de comprimento.");
    }
}