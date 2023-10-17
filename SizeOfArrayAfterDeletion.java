//Write a Java program to remove duplicate elements from an array and then return the new length of the array.
//For ex: Sample array: [20, 20, 30, 40, 50, 50, 50]
//After removing the duplicate elements the program should return 4 as the new length of the array.

package Placement;
import java.util.*;
public class SizeOfArrayAfterDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:-");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array which have duplicate element:-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashSet<Integer> hs = new HashSet<Integer>();
        int newIndex = 0;
        for (int num : arr) {
            if (hs.add(num)) { 
                arr[newIndex] = num;
                newIndex++;
            }
        }
        System.out.println("Actual size of array:- "+size);
        System.out.println("New length of array is:- " + newIndex);
        sc.close();
    }
}