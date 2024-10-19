/******************************************************************************
 *  Nafn    : Nafn nemanda 
 *  T-póstur: xxx@hi.is
 *
 *  Lýsing  : Lýsing á hvað forritið gerir, inntak, útreikningar, úttak 
 *
 *
 *****************************************************************************/

public class DaemiString {
    public static void main(String[] args) {

        System.out.println("Menntun".replace('n', 'U'));
        System.out.println("Menntun".replaceFirst("n", "UX"));

        "440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}");

    }
}
