/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi um notkun lita (enum)
 *
 *
 *****************************************************************************/

public class NotkunLita {
    public static void main(String[] args) {

        // skilgreinum breytu litur af taginu Litir og upphafsstillum með Litir.RAUDUR;
        Litir litur = Litir.RAUDUR;

        switch (litur) {
            case RAUDUR:
                System.out.println("Liturinn er rauður.");
                break;
            case GULUR:
                System.out.println("Liturinn er gulur.");
                break;
            case GRAENN:
                System.out.println("Liturinn er grænn.");
                break;
            case BLAR:
                System.out.println("Liturinn er blár.");
                break;
        }
    }
}

