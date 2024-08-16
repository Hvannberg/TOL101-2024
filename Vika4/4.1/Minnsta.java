import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn  inn þrjár heiltölur af staðalinntaki
 *  og finnur minnstu töluna og prentar hana út
 *
 *  Notkunardæmi
 *  %java Minnsta
 *  5 2 6
 *  2 <-- úttak
 *****************************************************************************/

public class Minnsta {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int a = inntak.nextInt();
        int b = inntak.nextInt();
        int c = inntak.nextInt();
        System.out.println(Math.min(a, Math.min(b, c)));
    }
}
