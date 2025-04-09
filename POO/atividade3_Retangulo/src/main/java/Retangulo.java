public class Retangulo {
    private int base;
    private int altura;

        public Retangulo(int base, int altura){
            this.base = base;
            this.altura = altura;
        }

        public int getBase(){
            return base;
        }
        public int getAltura(){
            return altura;
        }
        public void setBase(int novaBase){
            base = novaBase;
        }
        public void setAltura(int novaAltura){
            altura = novaAltura;
        }
        public int calcularArea(){
            return base * altura;
        }
        public int calcularPerimetro(){
            return base + base;
        }


}
