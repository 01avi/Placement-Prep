//WAP to sum values of an array.

package Placement;

import java.util.Scanner;
public class sum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int num = sc.nextInt();
        int sum = 0;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.print("Enterd Array:-");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Sum of the degits is:- " + sum);
        sc.close();
    }
}

