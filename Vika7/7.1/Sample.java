/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Velur M tölur úr N tölum 0 .. N-1
 *
 *  Notkunarlýsing:
 *
 *  %java Sample 3 10
 * óstokkað
 * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * stokkun hefst
 * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 * [0, 5, 2, 3, 4, 1, 6, 7, 8, 9]
 * [0, 5, 7, 3, 4, 1, 6, 2, 8, 9]
 * 0 5 7
 *
 *****************************************************************************/

import java.security.SecureRandom;
import java.util.Arrays;

public class Sample {
    // Skilgreinum og smíðum random hlut af klasanum SecureRandom
    private static SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);    // choose this many elements
        int N = Integer.parseInt(args[1]);    // from 0, 1, ..., N-1

        // create permutation 0, 1, ..., N-1
        int[] perm = new int[N];
        for (int i = 0; i < N; i++)
            perm[i] = i;

        System.out.println ("óstokkað");
        // gerum streng úr fylkinu og prentum
        System.out.println (Arrays.toString(perm));
        System.out.println ("stokkun hefst");
        // create random sample in perm[0], perm[1], ..., perm[M-1]
        for (int i = 0; i < M; i++) {
            // random integer between i and N-1
            int r = random.nextInt(N-i) + i;
            // swap elements at indices i and r
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
            System.out.println (Arrays.toString(perm));
        }

        // print results
        for (int i = 0; i < M; i++)
            System.out.print(perm[i] + " ");
        System.out.println();
    }
}
