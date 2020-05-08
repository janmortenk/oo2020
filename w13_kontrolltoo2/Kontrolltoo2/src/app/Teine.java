package app;

import java.util.*;
public class Teine implements AineInterface{
    
    private String name;
    private int molekulMass;

    public Teine(List<Ioon> Ioonid){
        int check = kontrolliLaengud(Ioonid);
        if(check == 1){
            this.name = createName(Ioonid);
            this.molekulMass = arvutaMass(Ioonid);
        }else{
            this.name = null;
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
    public int arvutaMass(List<Ioon> Ioonid) {
        int mass = 0;
        for(Ioon ioon : Ioonid){
            mass += ioon.getaatomMass();
        }
        return mass;
    }
    @Override
    public int kontrolliLaengud(List<Ioon> Ioonid) {
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
    @SuppressWarnings("Duplicates")
    public String createName(List<Ioon> Ioonid) {
        List<String> positiivne = new ArrayList<String>();
        List<String> negatiivne = new ArrayList<String>();
        String pos = "";
        String neg = "";
        String finalName = "";
        for(Ioon ioon : Ioonid){
            if(ioon.getLaeng() >= 0){
                positiivne.add(ioon.getName());
            }else{
                negatiivne.add(ioon.getName());
            }
        }

        Set<String> uniqueP = new HashSet<String>(positiivne);
        for (String key : uniqueP) {
            if(Collections.frequency(positiivne, key) > 1){
                pos += key + Collections.frequency(positiivne, key);
            }else{
                pos += key;
            }
        }

        Set<String> uniqueN = new HashSet<String>(negatiivne);
        for (String key : uniqueN) {
            if(Collections.frequency(negatiivne, key) > 1){
                pos += key + Collections.frequency(negatiivne, key);
            }else{
                pos += key;
            }
        }

        finalName += pos;
        finalName += neg;
        return finalName;
    }
}
