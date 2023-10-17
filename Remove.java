// WAP to remove a specific element from an array.

package Placement;
import java.util.Scanner;
public class Remove
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element of array:-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Enter the element you want to remove:-");
        int rem = sc.nextInt();
        System.out.println("Array after remove the element:-");
        for (int i = 0; i < size; i++) {
            if (arr[i] == rem) {
                continue;
            } else if(arr[i]!=rem){
                System.out.print(arr[i]);
            }
        }
        sc.close();
}
}
