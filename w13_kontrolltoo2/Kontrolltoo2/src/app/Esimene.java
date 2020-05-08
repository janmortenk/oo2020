package app;

//import java.util.ArrayList;
import java.util.List;

public class Esimene implements AineInterface{
    private String name;
    private int molekulMass;

    public Esimene(List<Ioon> Ioonid){
        int check = kontrolliLaengud(Ioonid);
        if(check == 1){
            this.name = createName(Ioonid);
            this.molekulMass = arvutaMass(Ioonid);
        }else{
            this.name = "Ainet ei saa kasutada";
            this.molekulMass = 0;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getmolekulMass() {
        return this.molekulMass;
    }

    @Override
    public int kontrolliLaengud(List<Ioon> Ioonid){
        int Laengud = 0;
        for(Ioon ioon : Ioonid){
            Laengud += ioon.getLaeng();
        }
        if(Laengud == 0){
            return 1;
        }else{
            return  0;
        }
    }
    

    @Override
    public int arvutaMass(List<Ioon> Ioonid){
        int mass = 0;
        for(Ioon ioon : Ioonid){
            mass += ioon.getaatomMass();
        }

        return mass;
    }

    @Override
    public String createName(List<Ioon> Ioonid) {
        String positiivne = "";
        String negatiivne = "";
        String finalName = "";
        for(Ioon ioon : Ioonid){
            if(ioon.getLaeng() >= 0){
                positiivne += ioon.getName();
            }else{
                negatiivne += ioon.getName();
            }
        }
        finalName += positiivne;
        finalName += negatiivne;
        return finalName;
    }
}
