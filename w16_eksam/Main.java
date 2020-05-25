import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Teekonnad info = new Teekonnad();

        Teekond teekond1 = new Teekond(5, 10, 20, 14, "Mercedes");
        Teekond teekond2 = new Teekond(5, 2, 4, 11, "Ford");
        Teekond teekond3 = new Teekond(4, 6, 2, 9, "Volvo");
        

        info.addTeekond(teekond1);
        info.addTeekond(teekond2);
        info.addTeekond(teekond3);
        info.vahemaad();

        int max = 0;

        if(teekond1 < 1){
            system.out.println("suurim")
        }

        System.out.println("----------------------------------");
        System.out.println("Busside mark");
        System.out.println("1.Liini bussi mark on  " + teekond1.getName());
        System.out.println("2.Liini bussi mark on  " + teekond2.getName());
        System.out.println("3.Liini bussi mark on  " + teekond3.getName()); 
    }
}