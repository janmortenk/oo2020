package app;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        Ioon Lämmastik = new Ioon("N", -3, 14);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Hapnik = new Ioon("O", -2, 16);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Lämmastik);
        Ioonid.add(Kloriid);
        Ioonid.add(Naatrium);
        Ioonid.add(Kaltsium);
        Ioonid.add(Hapnik);
        BufferedWriter writer = new BufferedWriter(new FileWriter("ained.txt"));
        
        
        while(running) {
            System.out.print("Ioonid, mida saate kasutada on: ");
            for(Ioon ioon : Ioonid){
                System.out.print(ioon.getName() + " ");
            }
            System.out.println("");
            System.out.println("Mitemest erinevast ioonidest soovite ainet luua: ");
            int n = input.nextInt();
            input.nextLine();
            String forFile = "";
            for(int i = 0; i < n; i++) {
                boolean correct = false;
                while(!correct) {
                    System.out.println("Sisestage üks ioon: ");
                    String temp = input.nextLine();
                    int ok = check(temp, Ioonid);
                    if(ok > 0){
                        correct = true;
                        forFile += temp + " ";
                    }else{
                        System.out.println("Iooni pole!");
                    }
                }
            }
            System.out.println(forFile);
            writer.append(forFile);
            writer.newLine();
            System.out.println("Kas soovid sisestada veel aine? y/n");
            String temp = input.nextLine();

            if(temp.equals("n")){
                running = false;
            }

        }

        writer.close();
        String line = new BufferedReader(new FileReader("ained.txt")).readLine();
        while (line != null){
            List<Ioon> ained = new ArrayList<>();
            String[] molekul = line.split(" ");
            for(int i = 0; i < molekul.length; i++){
                if(molekul[i].equals("N")){
                    ained.add(Lämmastik);
                }else if(molekul[i].equals("Cl")){
                    ained.add(Kloriid);
                }else if(molekul[i].equals("Na")){
                    ained.add(Naatrium);
                }else if(molekul[i].equals("Ca")){
                    ained.add(Kaltsium);
                }else if(molekul[i].equals("O")){
                    ained.add(Hapnik);
                }
            }
            Teine Aine = new Teine(ained);

            System.out.print("Ioonid: ");
            for(int i = 0; i < molekul.length; i++){
                System.out.print(molekul[i] + " ");
            }
            System.out.println("");
            if(Aine.getName() != null){
                System.out.println("Aine nimetus: " + Aine.getName());
            }else{
                System.out.println("Ainet pole võimalik luua");
            }
            line = new BufferedReader(new FileReader("ained.txt")).readLine();
            
        }

    }
    public static int check(String input, List<Ioon> Ioonid){
        int temp = 0;
        for(Ioon ioon : Ioonid){
            if(input.equals(ioon.getName())){
                temp +=1;
            }
        }

        return temp;
    }
    
}
