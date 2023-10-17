package Placement;

import java.util.*;
public class PakindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == num) {
            System.out.println("Valid palindrom");
        } else {
            System.out.println("Not a valid palindrom");
        }
        sc.close();
    }
}
