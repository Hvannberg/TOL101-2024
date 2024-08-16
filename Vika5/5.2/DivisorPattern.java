import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac DivisorPattern.java
 *  Execution:    java DivisorPattern n
 *  Úr Sedgewick og Wayne
 *
 *  Prints a table where entry (i, j) is a '* ' if i divides j
 *  or j divides i and '. ' otherwise.
 *
 *
 *  % java DivisorPattern
 *  20
 *  * * * * * * * * * * * * * * * * * * * * 1
 *  * *   *   *   *   *   *   *   *   *   * 2
 *  *   *     *     *     *     *     *     3
 *  * *   *       *       *       *       * 4
 *  *       *         *         *         * 5
 *  * * *     *           *           *     6
 *  *           *             *             7
 *  * *   *       *               *         8
 *  *   *           *                 *     9
 *  * *     *         *                   * 10
 *  *                   *                   11
 *  * * * *   *           *                 12
 *  *                       *               13
 *  * *         *             *             14
 *  *   *   *                   *           15
 *  * *   *       *               *         16
 *  *                               *       17
 *  * * *     *     *                 *     18
 *  *                                   *   19
 *  * *   * *         *                   * 20
 *
 ******************************************************************************/

public class DivisorPattern {

    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        int n = inntak.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(i);
        }
    }
}
