public class Proov{
    public static void main(String[] args){

        Info sp1 = new Info("Universaal", "Toyota", "Avensis", "Diisel", 1000, 6);
        Car sh1 = new Car(sp1);

        System.out.println("Võtab autode koguse: " + sp1.getAmount());
        System.out.println("Lisab juurde sisestatud arvu nt (2): Ehk = " + sh1.addAmount(2));//tuli kaks juurde
        System.out.println("Lõplik kogus: " + sh1.finalAmount);

        System.out.println("Auto andmed ja tüübid: " + sh1.specs());
        

    }
}