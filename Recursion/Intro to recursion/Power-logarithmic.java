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

    public static int power(int x, int n){
        if(n==0)
        {
            return 1;
        }
        
        int ans=power(x,n/2);
        int result=ans*ans;
        if(n%2==1)
        {
            result=x*result;
        }
        return result;
        
        
        
    }

}
