//WAP to reverse a given String?

package Placement;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String s = sc.nextLine();
        String str = new String();
        for (int i = s.length()-1; i > 0; i--) {
            str = str+s.charAt(i);
        }
        System.out.println(str);
           sc.close();
}
}

