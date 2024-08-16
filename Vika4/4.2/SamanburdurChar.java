/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn tvö bókstafi og ber þá saman. Les einnig inn inn
 *  staf og athugar hvort hann er bókstafur eða tölustafur
 *
 *  Efni: 4.3.4 og 4.4.5 (og/eða 4.4.6)
 *****************************************************************************/

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SamanburdurChar {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Sláðu inn tvo bókstafi með bili á milli");
        char stafur1 = inntak.next().charAt(0);        // Les inn streng (orð) og nær í fyrsta stafinn
        char stafur2 = inntak.next().charAt(0);       // Les inn streng (orð) og nær í fyrsta stafinn
        inntak.nextLine();                             // Lesum út á enda línu

        // Athuga hvort Unicode fyrir stafur1 er minni en stafur 2
        System.out.println(stafur1 + " er minni en " + stafur2 + " " + (stafur1 < stafur2));

        // Les inn einn bókstaf í einni línu
        System.out.println("Sláðu inn staf og <enter>");
        String s = inntak.nextLine();       // Les inn línu og setur í breytuna s
        System.out.println (s + " er bókstafur eða tölustafur "+Character.isLetterOrDigit(s.charAt(0)));
    }
}
