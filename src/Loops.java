// link: https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;


public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        int aux = 0;
        while (aux < q) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int eq = a + (int) Math.pow(2, 0) * b;

            for (int i = 0; i < n; i++) {
                System.out.print(eq + " ");
                eq += Math.pow(2, i + 1) * b;
            }

            System.out.println("");

            aux++;
        }
    }
}
