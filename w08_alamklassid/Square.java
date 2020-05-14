public class Square extends Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getCircum() {
        return 4*a;
    }

}