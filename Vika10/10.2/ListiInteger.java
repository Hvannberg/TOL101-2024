/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  e-mail: ebba@hi.is
 *
 *  Lýsing  : Sýnidæmi fyrir ArrayList<Integer>
 *
 *
 *****************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class ListiInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        System.out.println("eftir innlestur af staðalinntaki "+ list);
        System.out.println ("inniheldur 3 "+ list.contains (3));
        list.remove (list.indexOf(3));
        System.out.println ("inniheldur 3 "+ list.contains (3));
        list.add(100);
        System.out.println(list);
        System.out.println ("síðasti index-inn af 100 er "+list.lastIndexOf(100));
    }
}
