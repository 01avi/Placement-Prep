package Placement;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the String:-");
        str = sc.nextLine();
        int count = 0;
        int countTotal = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
            if (str.charAt(i)==' ' || str.charAt(i)!=' ') {
                countTotal++;
            }
        }
        System.out.println("Total number of words with spaces:- " + countTotal);
        System.out.println("Total number of words without spaces:- " + (countTotal-count));
        System.err.println("Total number of spaces:- " + count);
        sc.close();
    }
}
