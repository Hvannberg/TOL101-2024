import java.util.Scanner;

/******************************************************************************
 *  Nafn    : Liang, kafli 12.2
 *
 *
 *  Lýsing  : Sýnir hvernig aðferð getur kastað (throw) Exception
 *
 *
 *****************************************************************************/

public class QuotientFall {

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int result = 0;
        try {
            result = quotient(number1, number2);
            System.out.println("Result of " + number1 + "/" + number2 + " is " + result);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The execution continues ..");
    }
}
