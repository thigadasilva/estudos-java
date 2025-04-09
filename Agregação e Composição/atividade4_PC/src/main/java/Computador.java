public class Computador {
    private Processador processador;
    private Memoria memoria;
    private DiscoRigido discoRigido;

    public Computador(Processador processador, Memoria memoria, DiscoRigido discoRigido){
        this.processador = processador;
        this.memoria = memoria;
        this.discoRigido = discoRigido;
    }

    public Processador getProcessador() {
        return processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public DiscoRigido getDiscoRigido() {
        return discoRigido;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public void setDiscoRigido(DiscoRigido discoRigido) {
        this.discoRigido = discoRigido;
    }
}
