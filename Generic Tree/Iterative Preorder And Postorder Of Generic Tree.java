public static class Pair
  {
      int state;
      Node node;
      
      Pair(Node node,int state)
      {
        this.state=state;
        this.node=node;
      }
      Pair()
      {
          this.state=-1;
          this.node=null;
      }
  }

  public static void IterativePreandPostOrder(Node root) {
    // write your code here
        Stack<Pair> stk=new Stack<Pair>();
        
        ArrayList<Integer> preorder=new ArrayList<>();
        
        ArrayList<Integer> postorder=new ArrayList<>();
        
        Pair proot=new Pair(root,-1);
        stk.push(proot);
        
        while(stk.size()!=0)
        {
            Pair parent=stk.peek();
            
            if(parent.state==-1)
            {
                //preorder state
                
                preorder.add(parent.node.data);
                parent.state++;
            }
            else if(parent.state==parent.node.children.size())
            {
                //Postorder state
                postorder.add(parent.node.data);
                stk.pop();
            }
            else
            {
                //If we are between preorder and postorder
                
                //Making pair for children, state help us to identity which child we are traversing
                Pair p=new Pair(parent.node.children.get(parent.state),-1);
                
                //Pushing child
                stk.push(p);
                
            //    Increasing state of parent so that next time we traverse next child
                parent.state++;
            }
        }
        
        for(Integer i:preorder)
        {
            System.out.print(i+" ");
        }
        
        System.out.println();
        
         for(Integer i:postorder)
        {
            System.out.print(i+" ");
        }
        
        
  }
