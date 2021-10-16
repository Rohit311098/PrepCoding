public static ArrayList<Integer> nodetorootpath(Node root,int data)
  {
      if(root==null)
      {
          ArrayList<Integer> arr=new ArrayList<>();
          return arr;
      }
      
      if(root.data==data)
      {
          ArrayList<Integer> arr=new ArrayList<>();
          arr.add(root.data);
          return arr;
      }
      
      for(Node child:root.children)
      {
          ArrayList<Integer> temp=nodetorootpath(child,data);
          if(temp.size()>0)
          {
            temp.add(root.data);
            return temp;
          }

      }
      
      return new ArrayList<>();
  }


  public static int lca(Node root, int d1, int d2) {
    // write your code here
    
    ArrayList<Integer> temp1=nodetorootpath(root,d1);
    ArrayList<Integer> temp2=nodetorootpath(root,d2);
    
   
    
    //If any of the element doesnot exist in tree
    if(temp1.size()==0 || temp2.size()==0)
    {
        return 0;
    }
    
     int ans=-1;
     
     //We have to traverse both arrayList from last and comparing
     
     int i=temp1.size()-1;
     
     int j=temp2.size()-1;
     
     while(i>=0 && j>=0)
     {
         if(temp1.get(i)==temp2.get(j))
         {
            ans=temp1.get(i);
         }
         else
         {
             return ans;
         }
         
         i--;
         j--;
     }
     
     return ans;
  }
