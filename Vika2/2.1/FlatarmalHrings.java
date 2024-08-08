import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn radíus hrings af console, reiknar flatarmál hrings og prentar út
 *            Kafli 2.2.
 *  Notkun:
 *  %java FlatarmalHrings
 *  20  <-- inntak
 *  Flatarmál hrings fyrir radíus 20.0 er 1256.6370614359173 <-- uttak
 *
 *****************************************************************************/

public class FlatarmalHrings {
    public static void main(String[] args) {
        // Skilgreiningar á breytum
        double radius;  // Skilgreinum radíus hrings
        double flatarmalHrings;  // Skilgreinum flatarmál
        // Lesa inn radíus hrings af console
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        inntak.useLocale(Locale.US);
        radius = inntak.nextDouble();
        // Reikna flatarmál hrings
        flatarmalHrings = radius * radius * Math.PI;
        // Prenta út flatarmál
        System.out.println("Flatarmál hrings fyrir radíus " + radius + " er " + flatarmalHrings);
    }
}
