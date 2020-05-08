package app;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;


import static org.junit.Assert.*;

public class Tests {

    @Test
    public void test1(){
        Ioon VesinikPlus = new Ioon("H", 1, 1);
        assertEquals(1, VesinikPlus.getaatomMass());
    }

    @Test
    public void test2(){
        Ioon Nitraat = new Ioon("NO3", -1, 62);
        assertEquals(-1, Nitraat.getLaeng());
    }



    @Test
    @SuppressWarnings("Duplicates")
    public void test3(){
        int temp = 0;
        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        temp = Naatrium.getaatomMass() + Kloriid.getaatomMass();
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Naatrium);
        Ioonid.add(Kloriid);
        Esimene NaCl = new Esimene(Ioonid);
        assertEquals(temp, NaCl.getmolekulMass());
    }
    
    @Test
    @SuppressWarnings("Duplicates")
    public void test4(){

        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Kloriid = new Ioon("Cl", -1, 35);

        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Naatrium);
        Ioonid.add(Kloriid);

        Esimene NaCl = new Esimene(Ioonid);

        assertEquals("NaCl", NaCl.getName());
    }

    @Test
    public void test5(){
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Hapnik = new Ioon("O", -2, 16);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Kaltsium);
        Ioonid.add(Hapnik);
        Teine CaO = new Teine(Ioonid);
        assertEquals("CaO", CaO.getName());
    }

}
