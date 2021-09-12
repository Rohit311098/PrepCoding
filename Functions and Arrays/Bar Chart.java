import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int max=a[0];
     for(int i=0;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
    }
    while(max>0)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
            {
                System.out.print("*	");
                a[i]--;
            }
            else
            {
                System.out.print("	");
            }
        }
        System.out.println();
        max--;
    }
 }

}
