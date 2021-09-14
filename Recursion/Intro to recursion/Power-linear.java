import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(power(n, p));
    }

    public static int power(int n, int p){
        if(p==0)
    	{
    		return 1;
    	}
    	int ans=power(n,p-1);
    	return n*ans;
    }

}
