
package main;

import java.util.Scanner;


public class GondolatolvasoProgram {

    static String[] pakli = new String[22];
    static String[] szinek = {"P", "T", "Z", "M"};
    static String[] ertekek = {"","Ász", "Kir", "Fel", "X", "IX", "VIII"};
    
    
    static int szamlalo=0;
    static int oszlSzam;
    public static void main(String[] args) {
        pakliFeltolt();
        
        pakliKiir();
        kartyaValaszt();
        pakliKever();
        
        gondoltLapKiir();
    }
    
    private static void pakliFeltolt() {
        int ertekIndex=1;
        int szinIndex=0;
        for (int i = 1; i < pakli.length; i++) {
            pakli[i]=szinek[szinIndex]+"_"+ertekek[ertekIndex];
            if (ertekIndex==5) {
                ertekIndex=1;
            }
            if (i%6==0) {
                szinIndex++;
            }
            ertekIndex++;
        }
    }

    private static void pakliKiir() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.print(pakli[i]+" ");
            szamlalo++;
            if (szamlalo==3) {
                System.out.println("");
                szamlalo=0;
            }
        }
    }

    private static void kartyaValaszt() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Add meg a gondolt lapod oszlopának számát: ");
        oszlSzam=sc.nextInt();
        
        while (oszlSzam<1 || oszlSzam>3) {
            System.out.print("Nem jó, oszlopok száma(1, 2, 3). Újra: ");
            oszlSzam=sc.nextInt();
        }
    }

    private static void pakliKever() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void gondoltLapKiir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
