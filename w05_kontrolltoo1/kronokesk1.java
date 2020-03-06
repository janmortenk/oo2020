import java.util.Scanner;

public class kronokesk1{

  public static void main(String[] arg){
    double summa = 0;
    Scanner reader = new Scanner(System.in);
    for (int i = 1; i<4; i++){
      System.out.println("Palun sisestage " + i +"-3 number."); //kronoloogiliste keskmiste arvutamine
      double input = reader.nextDouble();
      if (i == 1 || i == 3){ 
        //kui saab ss jagame esimese ja viimase arvu kahega
        input = input / 2;
    }
      summa += input;
      
    }
    //tulemuse jagamine kahega
    summa = summa / 2; 
    System.out.println("Kronoloogiline keskmine on: " + summa);
    reader.close();
  }
}
