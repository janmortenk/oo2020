import java.io.*;
import java.util.*;

public class kronokesk3{

	public static void main(String[] arg) throws Exception{
    BufferedReader reader = new BufferedReader(new FileReader("kronosisend.txt"));
		List<String> kuup2ev = new ArrayList<String>();
		List<Double> temperatuur = new ArrayList<Double>();

		String line = reader.readLine();
		while(line!=null){
            String[] m = line.split(" ");
            kuup2ev.add(m[0]);
            //lisatakse temp 
			temperatuur.add(Double.parseDouble(m[1])/2 + Double.parseDouble(m[2]) + Double.parseDouble(m[3]) + Double.parseDouble(m[4]) + Double.parseDouble(m[5])/2);
            line = reader.readLine();
		}
        //faili kirjutamine
		PrintWriter writer = new PrintWriter(new FileWriter("kronov2ljund.txt"));
		for (int i = 0; i <= kuup2ev.size()-1; i++){
			writer.println(kuup2ev.get(i) + " " + Math.round((temperatuur.get(i)/4)*100.0)/100.0);
		}
        writer.close();
        reader.close();
  }
}
