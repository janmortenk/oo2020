public class Info{
    String brand;
    String mudel;
    String kere;
    String kutus;
    double hind;
    int kogus;

    public Info(String uus_brand, String uus_mudel, String uus_kere, String uus_kutus, double uus_hind, int uus_kogus){
        brand = uus_brand;
        mudel = uus_mudel;
        kere = uus_kere;
        kutus = uus_kutus;
        hind = uus_hind;
        kogus = uus_kogus;
    }
    public int getAmount(){
        return kogus;
    }
}