import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Lýsing á hvað forrit gerir, t.d. inntak, reikningar og úttak
 *
 *
 *****************************************************************************/

public class Einkunn  {
    private static final int LAGMARK = 5;
    private double maetingHlutfall;
    private int lokaprof;

    /**
     * Smiður fyrir Einkunn. Gætir þess að mætingarhlutfall sé löglegt. Ef ekki þá er það 0
     *
     * @param m mætingarhlutfall
     * @param l lokaprófseinkunn
     */
    public Einkunn(double m, int l) {
        if (erLoglegt(m))
            maetingHlutfall = m;
        else
            maetingHlutfall = 0.0;
        lokaprof = l;
    }

    /**
     * Hjálparfall sem segir til hvort m er á bilinu 0.0 til og með 1.0
     *
     * @param m mætingarhlutfall
     * @return true eða false eftir lögmæti m
     */
    private boolean erLoglegt(double m) {
        return m >= 0 && m <= 1.0;
    }

    public int getLokaprof() {
        return lokaprof;
    }

    public void setLokaprof(int l) {
        this.lokaprof = l;
    }

    /**
     * Setur mætingahlutfall sem m ef m er löglegt mætingahlutfall
     *
     * @param m mætingahlutfall á bilinu 0.0 og 1.0 (bæði meðtalin)
     */
    public void setMaetingHlutfall(double m) {
        if (erLoglegt(m))
            maetingHlutfall = m;
    }

    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }

    /**
     * Skilar true ef lokaprófseinkunn er stærri eða jafnt og 5.0
     *
     * @return true eða false eftir því hvort lokaprófseinkunn er stærri eða jafnt og 5.0
     */
    public boolean erLagmarkseinkunn() {
        return lokaprof >= LAGMARK;
    }


    public static void main(String[] args) {
        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        System.out.print("Settu inn mætingahlutfall og lokaprófseinkunn ");
        Einkunn e = new Einkunn(inntak.nextDouble(), inntak.nextInt());
        System.out.print("Breyttu lokaprófseinkunn ");
        e.setLokaprof(inntak.nextInt());
        System.out.println("Lokaprófseinkunn er "+e.getLokaprof());
        System.out.print("Breyttu mætingahlutfalli ");
        e.setMaetingHlutfall(inntak.nextDouble());
        System.out.print (" mætingahlutfall er "+ e.getMaetingHlutfall()+ ", ");
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        System.out.print("Settu inn mætingahlutfall og lokaprófseinkunn ");
        Einkunn e2 = new Einkunn(inntak.nextDouble(), inntak.nextInt());
        System.out.println("mætingahlutafall "+e2.getMaetingHlutfall());

        // bera saman e og e2

        // fleiri prófanatilvik hér

    }

}
