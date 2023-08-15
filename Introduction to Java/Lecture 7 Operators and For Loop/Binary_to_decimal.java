/*Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/





import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int decimal = 0;
		while(n>0) {
			
			if (n%10==0) {
				i++;
				n = n/10;
				}
			 if (n%10 != 0) {
			decimal+= 1 << i;
			i++;
			n=n/10;
			}
			
			}System.out.println(decimal);
		
		
	}

}
