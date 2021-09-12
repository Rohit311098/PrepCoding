Sample Input
4
3 12 13 15
Sample Output
[12, 15]



import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=al.size()-1;i>=0;i--)
		{
			if(isprime(al.get(i)))
			{
				al.remove(i);
			}
		}
		
		
	}
	private static boolean isprime(int n) {
	
		for (int i = 2; i <= n / 2; ++i) {
		      if (n % i == 0) {
		        return false;
		      }
		    }
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
