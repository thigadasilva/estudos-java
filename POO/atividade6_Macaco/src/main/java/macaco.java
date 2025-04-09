

public class macaco {

    public static void main(String[] args){
        macacoPOO macaco1 = new macacoPOO("Victor");
        macacoPOO macaco2 = new macacoPOO("Darlan");

        for(int i = 0; i < 3; i++) {
            macaco1.comer();
            macaco1.verEstomago();
            macaco1.digerir();

            macaco2.comer();
            macaco2.verEstomago();
            macaco2.digerir();
        }
    }
}
