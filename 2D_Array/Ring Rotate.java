import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int[][] arr=new int[n][m];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<m;j++)
	        {
	            arr[i][j]=sc.nextInt();
	        }
	    }
	    int s=sc.nextInt();
	    int r=sc.nextInt();
	    int[] oneD=getshell(arr,s); 
	    rotate(oneD,r);
	    fillshell(arr,oneD,s);
	    display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[] getshell(int[][] arr, int s) {
		int n=arr.length,m=arr[0].length;
		int fr=s-1,lr=n-s,fc=s-1,lc=m-s;
		int size=2*(lr-fr+1)+2*(lc-fc+1)-4;
		int[] oneD=new int[size];
		int k=0;
		for(int i=fr;i<=lr;i++)
		{
			oneD[k]=arr[i][fc];
			k++;
		}
		fc++;
		for(int i=fc;i<=lc;i++)
		{
			oneD[k]=arr[lr][i];
			k++;
			
		}
		lr--;
		for(int i=lr;i>=fr;i--)
		{
			oneD[k]=arr[i][lc];
			k++;
			
		}
		lc--;
		for(int i=lc;i>=fc;i--)
		{
			oneD[k]=arr[fr][i];
			k++;
			
		}
		return oneD;
	}
	private static void rotate(int[] oneD, int r) {
		// TODO Auto-generated method stub
		int n=oneD.length;
		r=(r%n+n)%n;
		reverse(oneD,0,n-r-1);
		reverse(oneD,n-r,n-1);
		reverse(oneD,0,n-1);
	}

	private static void reverse(int[] a, int start, int end) {
		for(int i=start,j=end;i<j;i++,j--)
	    {
	        int t=a[i];
	        a[i]=a[j];
	        a[j]=t;
	    }
	}

	private static void fillshell(int[][] arr, int[] oneD, int s) {
		int n=arr.length,m=arr[0].length;
		int fr=s-1,lr=n-s,fc=s-1,lc=m-s;
		int k=0;
		for(int i=fr;i<=lr;i++)
		{
			arr[i][fc]=oneD[k];
			k++;
		}
		fc++;
		for(int i=fc;i<=lc;i++)
		{
			arr[lr][i]=oneD[k];
			k++;
			
		}
		lr--;
		for(int i=lr;i>=fr;i--)
		{
			arr[i][lc]=oneD[k];
			k++;
			
		}
		lc--;
		for(int i=lc;i>=fc;i--)
		{
			arr[fr][i]=oneD[k];
			k++;
			
		}
		
	}

}
