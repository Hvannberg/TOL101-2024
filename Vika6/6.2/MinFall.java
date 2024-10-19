import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Finnur lægra gildi af tveimur og skrifar út.
 *            Gildin tvö eru fengin úr viðfangsbreytum
 *
 *
 *****************************************************************************/

public class MinFall {
    public static int min(int a, int b) {
        System.out.println ("min int útgáfan");
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static double min(double a, double b) {
        System.out.println("double útgáfan ");
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        double x = inntak.nextDouble();
        double y = inntak.nextDouble();
        double m = min(x, y);
        System.out.printf("Lággildið er %.2f \n", m);
    }
}
