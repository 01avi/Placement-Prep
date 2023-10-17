package Placement;

import java.util.Scanner;

public class PalindromString {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String You want to check Palindrom:-");
     String str = sc.nextLine();
     String s="";
     for (int i = str.length() - 1; i >=0; i--) {
         s = s + str.charAt(i);
     }
     if (s.equals(str)) {
         System.out.println("String " + str + " is Palindrom.");
     }
     else {
         System.out.println("String " + str + " is not Palindrom because it's reverse string is "+s);
     }
  }
}