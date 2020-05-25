import java.lang.Math;

public class Teekond {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private String name;
    
    public Teekond(int startX, int startY, int endX, int endY, String name) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.name = name;
    }
    //vahemaade arvutamine

    public double getVahemaa(){
        double Vahemaa = Math.sqrt(Math.pow((endX - startX), 2) + Math.pow((endY - startY),2));
        return Math.round(Vahemaa);
    }
    public String getName(){
        return name;
    }
}