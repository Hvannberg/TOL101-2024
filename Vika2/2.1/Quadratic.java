import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Leysir annars stigs jöfnuna x^2 +bx + c = 0 þar sem b og c eru
 *            viðföng sem lesin eru inn af console
 *
 *  Dæmi um notkun
 *  %java Quadratic
 *  -10.0 -8.0             <-- inntak
 *  10.744562646538029 <-- úttak byrjar
 *  -0.7445626465380286
 *****************************************************************************/

public class Quadratic {

    public static final double TVEIR = 2.0;
    public static final double FJORIR = 4.0;

    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);
        // parse coefficients from the console
        double b = inntak.nextDouble();
        double c = inntak.nextDouble();
        // calculate roots
        double discriminant = b * b - FJORIR * c;
        // double sqrt (double )  þetta er skilgreiningin á sqrt
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d) / TVEIR;
        double root2 = (-b - d) / TVEIR;
        // print them out
        System.out.println(root1);
        System.out.println(root2);
    }
}

