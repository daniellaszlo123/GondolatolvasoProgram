
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
        
        for (int i = 0; i < 3; i++) {
            pakliKiir();
            oszlValaszt();
            pakliKever();
            System.out.println("");
        }
        
        gondoltLapKiir();
    }
    
    private static void pakliFeltolt() {
        int ertekIndex=1;
        int szinIndex=0;
        for (int i = 1; i < pakli.length; i++) {
            pakli[i]=szinek[szinIndex]+"_"+ertekek[ertekIndex];
            ertekIndex++;
            if (ertekIndex==7) {
                ertekIndex=1;
            }
            if (i%6==0) {
                szinIndex++;
            }
        }
    }

    private static void pakliKiir() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.print(pakli[i]+"\t");
            szamlalo++;
            if (szamlalo==3) {
                System.out.println("");
                szamlalo=0;
            }
        }
    }

    private static void oszlValaszt() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Add meg a gondolt lapod oszlopának számát: ");
        oszlSzam=sc.nextInt();
        
        while (oszlSzam<1 || oszlSzam>3) {
            System.out.print("Nem jó, oszlopok száma(1, 2, 3). Újra: ");
            oszlSzam=sc.nextInt();
        }
    }

    private static void pakliKever() {
        oszlSzamKozepre(oszlSzam);
    }

    private static void gondoltLapKiir() {
        System.out.printf("A választott kártya a %s\n",pakli[11]);
    }

    private static String[] oszlFeltolt(int oszlSzam) {
        String[] oszlop = new String[7];
        int oszIndex=0;
        for (int i = oszlSzam; i < pakli.length; i+=3) {
            oszlop[oszIndex]=pakli[i];
            oszIndex++;
        }
        
        oszIndex=0;
        String[] oszlAlulrol = new String[7];
        for (int i = oszlop.length-1; i >= 0; i--) {
            oszlAlulrol[oszIndex]=oszlop[i];
            oszIndex++;
        }
        return oszlAlulrol;
    }

    private static void oszlSzamKozepre(int oszlSzam) {
        String[] elsoOszl=oszlFeltolt(1);
        String[] masodikOszl=oszlFeltolt(2);
        String[] harmadikOszl=oszlFeltolt(3);
        
        if (oszlSzam==1) {
            for (int i = 0; i < 7; i++) {
                pakli[i+1]=masodikOszl[i];
            }
            
            for (int i = 0; i < 7; i++) {
                pakli[8+i]=elsoOszl[i];
            }
            
            for (int i = 0; i < 7; i++) {
                pakli[15+i]=harmadikOszl[i];
            }
                        
        }
        else if (oszlSzam==2) {
            for (int i = 0; i < 7; i++) {
                pakli[i+1]=elsoOszl[i];
            }
            
            for (int i = 0; i < 7; i++) {
                pakli[8+i]=masodikOszl[i];
            }
            
            for (int i = 0; i < 7; i++) {
                pakli[15+i]=harmadikOszl[i];
            }
        }
        else{
            for (int i = 0; i < 7; i++) {
                pakli[i+1]=elsoOszl[i];
            }
            
            for (int i = 0; i < 7; i++) {
                pakli[8+i]=harmadikOszl[i];
            }
            
            for (int i = 0; i < 7; i++) {
                pakli[15+i]=masodikOszl[i];
            }
        }
    }
}
