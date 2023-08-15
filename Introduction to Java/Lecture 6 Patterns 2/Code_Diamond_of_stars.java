/*Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
  */





import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	int n1 = n/2 + 1;   // n1 = 4
	int n2 = n1 - 1;    // n2 = 3
	int i = 1;
	while (i <= n1) {
		int j = 1;
		
		while (j <= n1 - i ) {
			System.out.print(" ");
			j++;
			
		}
		j = 1;
		
		while(j <=  2*i-1) {
			
			System.out.print("*");
			j++;
			
			}
	System.out.println();
		i++;
		}
	
	i = 1;
	while (i<=n2) {
		int j = 1;
		while(j <= i) {
			System.out.print(" ");
			j++;
		}j=1;
		j = 2*i - 1;
		while(j <= 2*n2-1) {
			System.out.print("*");
			j++;
			
		}
	System.out.println();
		i++;
	}

}
}
 