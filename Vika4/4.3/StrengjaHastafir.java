import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn streng af staðalinntaki, eyðir öllum bilum fyrir og eftir strenginn og
 *  breytir í hástafi og setur punkt fyrir aftan
 *
 *  Notkunardæmi:
 *  java StrengjaHastafir
 *      Góðan daginn
 * Eftir strengjavinnslu:Góðan daginn.
 *
 *
 *****************************************************************************/

public class StrengjaHastafir {
    public static void main(String[] args) {
            Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
            String strengur = inntak.nextLine();
            System.out.println("Eftir strengjavinnslu:" + strengur.trim().toUpperCase()+".");
        }
    }
