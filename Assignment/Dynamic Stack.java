import java.io.*;
import java.util.*;

public class Main {

  public static class CustomStack {
		    protected int[] data;
		    protected int tos;

		    public CustomStack(int cap) {
		      data = new int[cap];
		      tos = -1;
		    }
		    
		    public int[] getData() {
				return data;
			}

			public void setData(int[] data) {
				this.data = data;
			}

			public int getTos() {
				return tos;
			}

			public void setTos(int tos) {
				this.tos = tos;
			}

		    int size() {
		     
		      return getTos()+1;
		    }

			void display() {
		     
		      int start=getTos();
		      int[] arr=getData();
		      for(int i=start;i>=0;i--)
		      {
		          System.out.print(arr[i]+" ");
		      }
		      System.out.println();
		      
		    }

		    void push(int val){
		    	setTos(getTos()+1);
		        data[getTos()]=val;
		    }

		    int pop() throws Exception{
		      
		      if(getTos()==-1)
		      {
		        throw new Exception("Stack underflow");
		      }
		      
		      int ele=data[getTos()];
		      setTos(getTos()-1);
		      
		      return ele;
		      
		    }

		    int top() throws Exception {
		      
		       if(getTos()==-1)
		       {
		          throw new Exception("Stack underflow");
		       }
		       return data[getTos()];
		    }
		  }
  
  public static class DynamicStack extends CustomStack
	  {
	    
	    public DynamicStack(int cap) {
			super(cap);
			// TODO Auto-generated constructor stub
		}

	    void pushd(int val){
	    	
	    	if(getTos()+1==getData().length/2)
	    	{
	    		int[] arr=getData();
	    		
	    		int[] newarr=new int[getData().length*2];
	    		
	    		for(int i=0;i<getTos()+1;i++)
	    		{
	    			newarr[i]=arr[i];
	    		}
	    		setData(newarr);
	    		push(val);
	    	}
	    	else
	    	{
	    		push(val);
	    	}
	     
	    }

	    
	  }

  public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       DynamicStack st=new DynamicStack(n);
      
    String str = sc.nextLine();
    while(str.equals("quit") == false){
        try
        {
          if(str.startsWith("push"))
          {
            int val = Integer.parseInt(str.split(" ")[1]);
            st.pushd(val);
          }
          else if(str.startsWith("pop"))
          {
            int val = st.pop();
            System.out.println(val);
          } 
          else if(str.startsWith("top"))
          {
            int val = st.top();
             System.out.println(val);
            
          } 
          else if(str.startsWith("size")){
            System.out.println(st.size());
          }
          else if(str.startsWith("display"))
          {
            st.display();
          }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
      str =sc.nextLine();
    }
      
  }
}
