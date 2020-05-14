
public class App {
    public static void main(String[] args) throws Exception {
        MyThread myThread1 = new MyThread("Esimesse korvi lisamine", 1000);
        MyThread myThread2 = new MyThread("Teise korvi lisamine", 600);
        myThread1.start();
        myThread2.start();
    }
}