//    To get you started you must format and print the input to complete the solution.
//
//    Input Format
//
//    Every line of input will contain a String followed by an integer.
//    Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range
//    from 0 to 999.
//
//    Output Format
//
//    In each line of output there should be two columns:
//    The first column contains the String and is left justified using exactly 15 characters.
//    The second column contains the integer, expressed in exactly 3 digits; if the original input has less than
//    three digits, you must pad your output's leading digits with zeroes.
//
//    Sample Input
//
//    java 100
//    cpp 65
//    python 50
//    Sample Output
//
//    ================================
//    java           100
//    cpp            065
//    python         050
//    ================================
//
//    Explanation
//
//    Each String is left-justified with trailing whitespace through the first  characters. The leading digit of
//    the integer is the  character, and each integer that was less than  digits now has leading zeroes.

import java.util.*;

public class OutputFormating {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        int firstInt = scanner.nextInt();
        String secondString = scanner.next();
        int secondInt = scanner.nextInt();
        String thirdString = scanner.next();
        int thirdInt = scanner.nextInt();

        System.out.println("================================");
        System.out.println(setString(firstString) + setInt(firstInt));
        System.out.println(setString(secondString) + setInt(secondInt));
        System.out.println(setString(thirdString) + setInt(thirdInt));
        System.out.println("================================");

    }

    static String setString(String text) {
        return String.format("%-15s", text);
    }

    static String setInt(int num) {
        return String.format("%03d", num);
    }
}
