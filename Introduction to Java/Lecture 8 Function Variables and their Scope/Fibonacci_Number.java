/*Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
*/




import java.util.Scanner;

public class Solution {
	
	public static boolean checkMember(int n) {
		
		int a=1,b=0,c=0;
		for(int i=1; i <= n; i++) {
			
			
			c = a+b;
			b=a;
			a=c;
			if(n==a) {
				return true;
			}
			
			}
	
		 
			return false;
		
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		
		boolean ans = checkMember(n);
		System.out.println(ans);
	}

}
