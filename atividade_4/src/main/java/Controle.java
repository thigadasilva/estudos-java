public class Controle {
    private int canal;
    private int volume;

        public Controle(int canal, int volume){
            this.canal = canal;
            this.volume = volume;
        }

        public int getCanal(){
            return canal;
        }
        public int getVolume(){
            return volume;
        }
        public void setCanal(int novoCanal){
            canal = novoCanal;
        }
        public int aumentarVolume(){
            return volume + 10;
        }
        public int diminuirVolume(){
            return aumentarVolume() - 5;
        }
}
