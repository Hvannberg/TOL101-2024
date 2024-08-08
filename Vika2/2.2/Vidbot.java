/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Nokkur dæmi um viðbótargildingu (augmentation)
 *  Dæmi um notkun:
 *  %java Vidbot
 *  Verð með VSK er 6.2 <-- útttak
 *  teljari er 1
 *  x er 0.40816326530612246
 *
 *****************************************************************************/

public class Vidbot {
    public static void main(String[] args) {
        final double VSK = 0.24;
        double verd = 5;
        int teljari = 0;
        double x = 5;
        verd += verd * VSK;    // sama og verd = verd + verd*VSK;
        teljari += 1;         // sama og teljari = teljari + 1;
        x /= 4 + 5.5 * 1.5;  // sama og x = x / (4 + 5.5 * 1.5);
        System.out.println("Verð með VSK er " + verd);
        System.out.println("teljari er " + teljari);
        System.out.println("x er " + x);
    }
}
