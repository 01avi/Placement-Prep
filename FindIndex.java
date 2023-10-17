//WAP to find the index of an array element.

package Placement;
import java.util.Scanner;
public class FindIndex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;
        System.out.println("Enter size of array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Which element you looking for:-");
        int look = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (look == arr[i]) {
                temp = i + 1;
            }
        }
        if (temp > 0) {
            System.out.println("Yes! This element is on " + temp + "th place");
        }
        else {
             System.out.println("Sorry! The element " + look + " is not present in the arrray");
        } 
        sc.close();
    }
}
