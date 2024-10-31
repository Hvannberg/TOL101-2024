/******************************************************************************
 *  Nafn    : Liang
 *  T-póstur:
 *
 *  Lýsing  : Sjá kafla 17.4.1
 *
 *
 *****************************************************************************/

import java.io.*;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (   // Autoclose
                // Create an output stream to the file
                FileOutputStream output = new FileOutputStream(args[0]);
        ) {
            // Output values to the file
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }

        try (
                // Create an input stream for the file
                FileInputStream input = new FileInputStream(args[0]);
        ) {
            // Read values from the file
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
}
