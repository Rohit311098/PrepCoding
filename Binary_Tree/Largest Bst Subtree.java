  public static class Pairbst
  {
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      int count=0;
      boolean isbst=true;
      
  }
  
  static Node largestbstnode=null;
  static int largest_count=0;
  
  public static Pairbst largestbst(Node root)
  {
      if(root==null)
      {
          return new Pairbst();
      }
      
      Pairbst left=largestbst(root.left);
      
      Pairbst right=largestbst(root.right);
      
      Pairbst curr=new Pairbst();
      
      curr.count=left.count+right.count+1;
      if(left.max<root.data && right.min>root.data && left.isbst && right.isbst)
      {
          
          
          if(largest_count<curr.count)
          {
              largestbstnode=root;
              largest_count=curr.count;
          }
      }
      else
      {
          curr.isbst=false;
      }
      
      curr.min=Math.min(root.data,left.min);                
      curr.max=Math.max(root.data,right.max);
      
      return curr;
  }
