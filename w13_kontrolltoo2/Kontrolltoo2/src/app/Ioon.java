package app;

public class Ioon implements IoonInterface {
    private String name;
    private int Laeng;
    private int aatomMass;

    public Ioon(String name, int Laeng, int aM){
        this.name = name;
        this.Laeng = Laeng;
        this.aatomMass = aM;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getLaeng() {
        return this.Laeng;
    }

    @Override
    public int getaatomMass() {
        return this.aatomMass;
    }
}
