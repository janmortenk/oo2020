public class Trapets extends Shape {
    double a;
    double b;
    double c;
    double d;

    public Trapets(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getCircum() {
        return a+b+c+d;
    }

}