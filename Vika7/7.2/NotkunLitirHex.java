/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi um notkun lita (enum) með eiginleikum
 *
 *
 *****************************************************************************/

public class NotkunLitirHex {
    public static void main(String[] args) {
       
        for (LitirHex litur : LitirHex.values()) {
            System.out.println(litur + " hefur litakóðann: " + litur.getHexValue());
        }
    }
}
