/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Les inn heiltölu þar til talan er 0
 *
 *
 *****************************************************************************/

import java.util.Scanner;

public class Notendastyring {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Read an initial data
        System.out.print(
                "Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        // Keep reading data until the input is 0
        while (data != 0) {
            sum += data;
            // Read the next data
            System.out.print(
                    "Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
