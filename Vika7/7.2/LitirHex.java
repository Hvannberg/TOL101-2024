/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi um enum með eiginleika, smið og get-aðferð
 *
 *
 *****************************************************************************/
public enum LitirHex {
    RAUDUR("#FF0000"),
    GULUR("#FFFF00"),
    GRAENN("#00FF00"),
    BLAR("#0000FF");

    private String hexValue;

    // smiður sem tengir hex gildi við litinn
    LitirHex(String hexValue) {
        this.hexValue = hexValue;
    }

    // get-er aðferð til að ná í hex gildið
    public String getHexValue() {
        return this.hexValue;
    }
}

