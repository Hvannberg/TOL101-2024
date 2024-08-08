import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Tekur inn hitastig í Fahrenheit (kommutala) frá console
 *  og skilar út í Celcíus á staðalúttaki
 *  Dæmi um notkun
 *  java FTilC
 *  32.0 <<inntak
 *  0.0  <<úttak
 *
 *****************************************************************************/

public class FTilC {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);
        double fahrenheit = inntak.nextDouble();
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celcius);
    }
}
