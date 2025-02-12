package For;

import java.util.Scanner;

public class For_22 {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (i % 4 == 0) {
                System.out.println("entre 1 e 200 os numeros divisiveis por 4 são: " + i);
            } else {
                System.out.println(" .. ");
            }
        }

    }
}