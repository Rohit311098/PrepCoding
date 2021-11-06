public static void iterativePrePostInTraversal(Node root) {
    // write your code here
    
    ArrayList<Integer> pre=new ArrayList<Integer>();
    ArrayList<Integer> post=new ArrayList<Integer>();
    ArrayList<Integer> ino=new ArrayList<Integer>();
      
      
     Stack<Pair> stk=new Stack<Pair>();
      Pair proot=new Pair(root,-1);
      
      stk.push(proot);
      while(stk.size()>0)
      {
          Pair par=stk.peek();
          
          if(par.state==-1)
          {
              pre.add(par.node.data);
                if(par.node.left!=null)
                {
                  Pair pleftchild=new Pair(par.node.left,-1);
                  stk.push(pleftchild);
                }
               par.state++;
              
          }
          else if(par.state==0)
          {
              ino.add(par.node.data);
              if(par.node.right!=null)
              {
                Pair prightchild=new Pair(par.node.right,-1);
                 stk.push(prightchild);
              }
               par.state++;
          }
          else if(par.state==1)
          {
            post.add(par.node.data);
            stk.pop(); 
          }
      }
      
      for(Integer i:pre)
      {
          System.out.print(i+" ");
      }
      
      System.out.println();
      for(Integer i:ino)
      {
          System.out.print(i+" ");
      }
      
      System.out.println();
      for(Integer i:post)
      {
          System.out.print(i+" ");
      }
      
      
  }
