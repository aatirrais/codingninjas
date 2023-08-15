/*Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/





import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();

	  System.out.println("*");

	    
	    // Print the first upper half
	    for(int i=1; i<=N; i++)
	    {
	        System.out.print("*");
	        for(int j=1; j<=i; j++)
	        {
	        	System.out.print(j); 
	        }

	        for(int j=i-1; j>=1; j--)
	        {
	        	System.out.print(j); 
	        }
	        System.out.print("*"); 
	        System.out.println();  
	    }

	    // Print the lower half of the pattern
	    for(int i=N-1; i>=1; i--)
	    {
	    	System.out.print("*");
	        for(int j=1; j<=i; j++)
	        {
	        	System.out.print(j);
	        }

	        for(int j=i-1; j>=1; j--)
	        {
	        	System.out.print(j); 
	        }
	        System.out.print("*");

	        System.out.println();
	    }
	    System.out.print("*");


	}

}