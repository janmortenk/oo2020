public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("Ford", CarType.MAASTUR, CarColorType.RED);
        car1.action();
        Car car2 = new Car("Porsche", CarType.SEDAAN, CarColorType.WHITE);
        car2.action();
    }
}