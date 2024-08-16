/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn hnit vigurs af staðalinntaki, finnur lengdina
 *  og prentar út
 *
 *  Notkunardæmi
 *
 *  %java LengdVigurs
 *  Hvert er x 2
 *  Hvert er y 3
 *  lengd (2,3)  er 3.605551275463989
 *
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class LengdVigurs {


    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Hvert er x ");
        int x = inntak.nextInt();
        System.out.print("Hvert er y ");
        int y = inntak.nextInt();

        double lengd = Math.sqrt(x * x + y * y);
        System.out.println(" lengd (" + x + "," + y + ")  er " + lengd);
    }
}
