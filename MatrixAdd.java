package Placement;

import java.util.Scanner;

public class MatrixAdd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row Size of matrix");
        int r = sc.nextInt();
        System.out.println("Enter the colomn Size of matrix");
        int c = sc.nextInt();
        int matrix1[][] = new int[r][c];
        int matrix2[][] = new int[r][c];
        int add[][] = new int[r][c];

        System.out.println("Enter the element of the I Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the element of II Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                add[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
}
}

