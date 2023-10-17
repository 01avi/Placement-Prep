package Placement;

import java.util.Scanner;
class SandGlassPattern
{
	public static void main(String args[])
	{		
		int i,j,n;
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
    		n = sc.nextInt();
			//1st half;
		for(i=n;i>=1;i--)
		{
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	     	//2nd half;
            	for(i=1;i<=n;i++)
    		{
        		for(j=i;j<n;j++)
        		{
            			System.out.print(" ");
        		}
        		for(j=1;j<=(2*i-1);j++)
        		{
            			System.out.print("*");
        		}
        		System.out.println("");
    		}
	}
}