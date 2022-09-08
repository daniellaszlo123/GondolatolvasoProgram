
package main;


public class GondolatolvasoProgram {

    static String[] pakli = new String[22];
    static String[] szinek = {"P", "T", "Z", "M"};
    static String[] ertekek = {"","Ász", "Kir", "Fel", "X", "IX", "VIII"};
    
    
    static int szamlalo=0;
    public static void main(String[] args) {
        pakliFeltolt();
        pakliKiir();
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
}
