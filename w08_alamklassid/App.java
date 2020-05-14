public class App {
    public static void main(String[] args) throws Exception {
        Shape kujund1 = new Square(20);
        Shape kujund2 = new Trapets(4, 15, 5, 10);

        System.out.println("Trapetsi ümbermõõt: " + kujund1.getCircum() + "cm");
        System.out.println("Ruudu ümbermõõt: " + kujund2.getCircum() + "cm");

       
    }
}