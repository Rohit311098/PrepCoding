import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
         
     // write ur code here
     Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int stars=1,spaces=2*n-3;
	     for(int i=1;i<=n;i++)
	     {
	    	 int val=1;
	    	 int temp=val;
	         for(int j=1;j<=stars;j++)
	         {
	             System.out.print(temp+"	");
	             temp++;
	         }
	         for(int j=1;j<=spaces;j++)
	         {
	             System.out.print("	");
	         }
	         if(i==n)
	         {
	             
	             stars--;
	         }
	         temp=stars;
	         for(int j=1;j<=stars;j++)
	         {
	             System.out.print(temp+"	");
	             temp--;
	             
	         }
	         System.out.println();
	         stars++;
	         spaces-=2;
	         
	     }
     

 }
}
