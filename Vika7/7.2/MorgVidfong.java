/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Skrifar út viðföngin sem eru sett í skipanalínu og fjölda þeirra
 *
 *
 *****************************************************************************/

public class MorgVidfong {
    public static void main(String[] args) {

        System.out.println("Það eru " + args.length + " viðföng:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ": " + args[i]);
        }
    }
}
