import java.math.BigInteger;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi um BigInteger
 *
 *
 *****************************************************************************/

public class StorarTolur {
    public static void main(String[] args) {
        long tala = Long.MAX_VALUE;
        System.out.println (tala * 2); // of stór tala

        BigInteger a = new BigInteger ("9223720367890280989");
        BigInteger b= new BigInteger ("2");

        BigInteger c = a.multiply(b);
        System.out.println (a + " * " + b + " = "+ c);

    }
}
