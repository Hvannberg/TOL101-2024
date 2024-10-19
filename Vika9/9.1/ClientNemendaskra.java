import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Notkunarklasi (client class) fyrir Nemendaskrá klasann
 *            Til að hægt sé að keyra þetta forrit þarf að hafa líka
 *            Nemendaskra.class og Nemandi.class í sömu möppu
 *
 *****************************************************************************/

public class ClientNemendaskra {
    public static void main(String [] args) {
        System.out.print("Hvað á skólinn að hafa marga nemendur? ");
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int staerdSkola = inntak.nextInt();
        Nemendaskra hi = new Nemendaskra("Háskóli Íslands", staerdSkola);
        System.out.println ("tóm nemendaskrá ");
        System.out.println(hi);
        Nemandi nem1 = new Nemandi("Blær", "b@hi.is");
        if (hi.erLaustPlass())  // gæta þess að forskilyrðið haldi
            hi.skraNemanda(nem1);

        Nemandi nem2 = new Nemandi("Dagný", "d@hi.is");
        if (hi.erLaustPlass()) // gæta þess að forskilyrðið haldi
            hi.skraNemanda(nem2);
        Nemandi nem3 = new Nemandi("Hringur", "h@hi.is");
        if (hi.erLaustPlass()) // gæta þess að forskilyrðið haldi
            hi.skraNemanda(nem3);

        System.out.println(" Nemendaskrá eftir að nemendur hafa verið skráðir í skólann");
        System.out.println(hi);
        Nemandi nyrNemandi = new Nemandi("Nyr", "n@hi.is");
        if (hi.erLaustPlass()) {
            hi.skraNemanda(nyrNemandi);
        }
        else {
            if (hi.urskraNemanda(nem2)) {
                System.out.println(nem2 + " skráður úr skóla");
                System.out.println ("eftir úrskráningu ");
                System.out.println(hi);
            }
            else {
                System.out.println(nem2 + " er ekki skráður í skóla");
            }
            if (hi.erLaustPlass()) { // gæta þess að forskilyrðið haldi
                hi.skraNemanda(nyrNemandi);
            }
        }
        System.out.println("Nemendaskrá í lokin");
        System.out.println(hi.nemendalisti());
        System.out.println(hi);
    }
}
