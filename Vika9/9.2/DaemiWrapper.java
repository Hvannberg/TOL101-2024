/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi um Integer klaann
 *
 *
 *****************************************************************************/

public class DaemiWrapper {
    public static void main(String[] args) {
        Integer x = Integer.valueOf("32");
        Integer y = Integer.valueOf("45");
        Integer z = x + y;  // hægt að nota + virkjann þó svo að við séum að leggja saman 2 hluti af
                            // Integer klasanum

        System.out.println ("summan af x + z " + z);
        int  z2 = x + y;
        System.out.println (z2);
        System.out.println (" Dæmi um tölur í tvíunda, tuga og áttakerfi");
        System.out.println (Integer.parseInt("1000",2)); // 1*8 + 0*4 + 0*2 * 0*1
        System.out.println (Integer.parseInt("13",10)); // 1*10 + 3*1
        System.out.println (Integer.parseInt("12",8)); // 1*8 + 2*1

    }
}
