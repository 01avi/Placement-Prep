 //WAP to find the maximum & minimum occurring number in given array?
package Placement;
import java.util.Scanner;
public class FindMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:-");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements:-");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0;
        int min=arr[0];
        for (int i = 0; i < size; i++) {
             if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > min) {
                max = arr[i];
            }
        }
        System.out.println("Minimum element is:- " + min);
        System.out.println("Maximum element is:- "+max);
        sc.close();
    }
}


