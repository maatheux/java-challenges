//link: https://www.hackerrank.com/challenges/java-datatypes/problem

import java.util.*;

public class Datatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();

        for (int i = 0; i < numberOfTests; i++) {
            String numberStr = scanner.next();

            try {
                long number = Long.parseLong(numberStr);

                System.out.println(number + " can be fitted in:");
                if (number >= -128 && number <= 127) {
                    System.out.println("* byte");
                }
                if (number >= -32768 && number <= 32767) {
                    System.out.println("* short");
                }
                if (number >= Math.pow(-2, 31) && number <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (number >= Math.pow(-2, 63) && number <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(numberStr + " can't be fitted anywhere.");
            }
        }
    }
}
