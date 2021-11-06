//Starting Approach 1--> Brute Force Approach
    //TC-O(N)   SC-O(N)
  public static void approach1(Node root,int target)
  {
     ArrayList<Integer> arr=new ArrayList<Integer>();
     
     getinorder(root,arr)   ;
     int i=0,j=arr.size()-1;
     while(i<j)
     {
        int sum=arr.get(i)+arr.get(j);
        if(sum==target)
        {
            System.out.println(arr.get(i)+" "+arr.get(j));
            i++;
            j--;
        }
        else if(sum<target)
        {
            i++;
        }
        else
        {
            j--;
        }
     }
     
  }
   
  public static void getinorder(Node root,ArrayList<Integer> arr)
  {
      if(root==null)
      {
          return;
      }
      getinorder(root.left,arr);
      arr.add(root.data);
      getinorder(root.right,arr);
  }
  


  //Starting Approach 2- Optimised in terms of space with poor TC
  // TC-O(N*H)  SC-O(H) (Recursion Space)
  public static boolean find(Node root, int data){
    if(root==null)
    {
        return false;
    }
    
    if(root.data==data)
    {
        return true;
    }
    
    if(root.data>data)
    {
        return find(root.left,data);
    }

    return find(root.right,data);
  }  
  
  public static void approach2(Node curr,Node root,int target)
  {
      if(curr==null)
      {
          return;
      }
      approach2(curr.left,root,target);
       if(curr.data>=target/2) return;
      int remsum=target-curr.data;
      if(find(root,remsum)==true)
      {
          System.out.println(curr.data+" "+remsum);
      }
      approach2(curr.right,root,target);
  }
  
  


  //Approach 3- Most Optimised
  // TC-O(N)  SC-O(H) (Recusion space)
  
   public static void approach3(Node root, int target){
      Stack<Pair> inorder = new Stack<>();
      inorder.push(new Pair(root, -1));
      
      Stack<Pair> reverseInorder = new Stack<>();
      reverseInorder.push(new Pair(root, -1));
      
      int left = iterativeInorder(inorder);
      int right = iterativeReverseInorder(reverseInorder);
      
      while(left < right){

          if(left + right == target){
            System.out.println(left + " " + right);
            left = iterativeInorder(inorder);
            right = iterativeReverseInorder(reverseInorder);
            
          } else if(left + right < target){
            left = iterativeInorder(inorder);  
          } else {
            right = iterativeReverseInorder(reverseInorder);
          }
      }
  }
  public static int iterativeInorder(Stack<Pair> stk) {
    while(!stk.isEmpty()){
        Pair par = stk.peek();
        
        if(par.state == -1){
            // preorder
                
            if(par.node.left != null){
                stk.push(new Pair(par.node.left, -1));
            }
            par.state++;
            
        } else if(par.state == 0){
            // inorder
            int val = par.node.data;
            
            if(par.node.right != null){
                stk.push(new Pair(par.node.right, -1));
            }
            par.state++;
            
            return val;
            
        } else if(par.state == 1){
            // postorder
            stk.pop();
        }
    }
    
    return -1;
  }
  
  public static int iterativeReverseInorder(Stack<Pair> stk) {
    
    while(!stk.isEmpty()){
        Pair par = stk.peek();
        
        if(par.state == -1){
            // reverse preorder
            if(par.node.right != null){
                stk.push(new Pair(par.node.right, -1));
            }
            par.state++;
            
        } else if(par.state == 0){
            // reverse inorder
            int val = par.node.data;
            
            if(par.node.left != null){
                stk.push(new Pair(par.node.left, -1));
            }
            par.state++;
            
            return val;
            
        } else if(par.state == 1){
            // reverse postorder
            stk.pop();
        }
    }
    return -1;
  }
