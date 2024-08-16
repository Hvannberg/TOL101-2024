import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac HarmonicNumber.java
 *  Execution:    java HarmonicNumber n
 *  Úr Sedgewick og Wayne
 *
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 *
 *  % java HarmonicNumber
 *  10
 *  2.9289682539682538
 *
 *  java HarmonicNumber
 *  1000
 *  7.485470860550343
 *
 *  % java HarmonicNumber
 *  10000
 *  9.787606036044348
 *
 ******************************************************************************/

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner inntak = new Scanner (System.in, StandardCharsets.UTF_8);
        // lesa n af staðalinntaki
        int n = inntak.nextInt();

        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
    }
}
