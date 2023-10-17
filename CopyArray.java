//WAP to copy an array by iterating the array.

package Placement;

import java.util.Scanner;

public class CopyArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter the element of an array");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        System.out.println("Entered Array:-");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Copied Array:-");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
}
}
