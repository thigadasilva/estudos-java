public class CarroPOO {

    public static void main(String[] args){
        Carro meuCarro = new Carro("Fusca");

        meuCarro.acelerar(20);

        meuCarro.mostraVelocidade();

        Caminhao meuCaminhao = new Caminhao("Cybertruck");

        meuCaminhao.acelerarC(200);

        meuCaminhao.mostraVelocidadeC();
    }

}
