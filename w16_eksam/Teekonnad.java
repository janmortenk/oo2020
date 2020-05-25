import java.util.ArrayList;
import java.util.List;

public class Teekonnad {
    private final List<Teekond> info = new ArrayList<>();

    public void addTeekond(Teekond teekond) {
        info.add(teekond);
    }
    //prindib liinide vahemaad
    public void vahemaad() {
        for (int i = 0; i < info.size(); i++) {
            System.out.println(i + 1 + ".Liin: Buss sõitis " + info.get(i).getVahemaa() + " kilomeetrit.");
            
        }
        
    }
    public void getName() {
    }
}