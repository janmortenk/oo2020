import java.util.Scanner;

public class kronokesk2{
	public static void main(String[] arg){
		double summa = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Kui palju numbreid soovite sisestada?");
		int n = reader.nextInt();
		for (int i = 1; i <= n; i++){
			System.out.print(i + ". number: ");
			double input = reader.nextDouble();
			if (i == 1 || i == n){
				input = input / 2;
			}
            summa += input;
            
		}
		summa = Math.round((summa / (n-1))*100.0)/100.0;
        System.out.println("Kronoloogiline keskmine on: " + summa);
        reader.close();
	}
}
