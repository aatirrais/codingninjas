/*Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i = 1;
		
		while(i <= n) {
			int j = 1;
			int t = i;
			
			while(j <= n-i+1) {
				int x = 2 * t - 1;
				System.out.print(x);
				
				j++;
				t++;
			} j=1;
			t=1;
			while (j <= i -1) {
				int x = 2*t-1;
				System.out.print(x);
				j++;
				t++;
			}
			
			System.out.println();
			i++;
		}

	}

}
