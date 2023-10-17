package Placement;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String:-");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        System.out.println("Enter 2nd String:-");
        String s2 = sc.nextLine();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            boolean res = Arrays.equals(a1, a2);
            if (res) {
                System.out.println("Strings are anagram");
            } else {
                System.out.println("String is not anagram");
            }
        } else {
            System.out.println("String is not anagram");
        }
        
        

}
}

