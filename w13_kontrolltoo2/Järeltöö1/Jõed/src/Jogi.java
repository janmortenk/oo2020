import java.lang.Math; 

public class Jogi {

    private String name;
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public Jogi(String name, double startX, double startY, double endX, double endY) {
        this.name = name;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public String getName(){
        return name;
    }

    // lähtme ja suudme vahelise kauguse funktsioon
    public double getLength(){
        return Math.sqrt(Math.pow((endX - startX), 2) + Math.pow((endY - startY),2));
    }

    public static void main(String [] args) {

        Jogi j = new Jogi("Ema Jõgi", 1.2,2.4,4.5,6.9) ;
        System.out.println(j.getName()+" lähtme ja suudme vaheline kaugus on: " +  j.getLength() + " m");
        
    }
}