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
    int ele=sc.nextInt();
    int index=-1;
    for(int i=0;i<n;i++)
    {
        if(ele==a[i])
        {
            index=i;
            break;
        }
    }
    System.out.println(index);
    
 }

}
