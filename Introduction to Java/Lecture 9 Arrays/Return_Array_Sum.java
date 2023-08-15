/*Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the sum of the numbers in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
Sample Input 2:
2
5
1 2 3 4 5 
3
10 20 30 
Sample Output 2:
15
60
*/




import java.util.Scanner;
public class Solution {
	
	
	
	public static int [] input() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int array[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = s.nextInt();
		} return array;
	}
	
	public static int sum(int array[]) {
		int temp = 0;
		int size= array.length;
		for (int i=0; i<size; i++) {
			temp+=array[i];
		}return temp;
	}
	
	public static int[] scan() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp[] = new int[num];
		for (int i = 0; i<num; i++) {
			int array[] = input();
			temp[i] = sum(array);
			
			}return temp;
	}
	
	public static void print(int temp[]) {
		
		int num = temp.length;
		for (int i = 0; i < num; i++) {
			System.out.println(temp[i]);
		}
	}
	

	public static void main(String[] args) {
		
		int arr[]=scan();
		print(arr);
		
		
		
		
		

	}

}

