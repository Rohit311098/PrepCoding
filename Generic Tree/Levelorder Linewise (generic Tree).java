public static void levelOrderLinewise(Node root){
      
    //   //Method 1 Using Extra Queue
    //   levelordermethod1(root);
      
    //   //Method 2 Using a Deliminator
      
    //   levelordermethod2(root);
      
      
      //Method3 We make a counter variable
      
      levelordermethod3(root);
    
    
  }

public static void levelordermethod1(Node root)
  {
      if(root==null)
      {
          return;
      }
      
      Queue<Node> mainQ=new ArrayDeque<>();
      
      //Pushing root node
      mainQ.add(root);
      
      while(mainQ.size()>0)
      {
         Queue<Node> childQ=new ArrayDeque<>();
         
         while(mainQ.size()>0)
         {
             Node curr=mainQ.remove();
             System.out.print(curr.data+" ");
             
             for(Node child:curr.children)
             {
                 childQ.add(child);
             }
         }
         
         System.out.println();
         mainQ=childQ;
      }
  }

 public static void levelordermethod2(Node root)
  {
      if(root==null)
      {
          return ;
      }
      
      //Making Queue for traversal
      Queue<Node> queue=new ArrayDeque<>();
      
      //Adding root node into queue
      queue.add(root);
      
      //Making a deliminator Node
      Node dummy=new Node();
      dummy.data=-1;
      
      //Adding Deliminator node in Queue
      queue.add(dummy);
      
      while(queue.size()>0)
      {
          
          Node curr=queue.remove();
          if(curr.data==-1)
          {
              System.out.println();
              
              if(queue.size()>0)
              {
                queue.add(dummy);
              }
          }
          else
          {
              System.out.print(curr.data+" ");
              for(Node child:curr.children)
              {
                  queue.add(child);
              }
          }
      }
      
      
  }
  
  public static void levelordermethod3(Node root)
  {
        if(root==null)
        {
            return;
        }
    
    Queue<Node> q=new ArrayDeque<>();
    q.add(root);
    
    while(q.size()>0)
    {
        int counter=q.size();
        
        for(int i=0;i<counter;i++)
        {
            Node curr=q.remove();
            System.out.print(curr.data+" ");
            
            for(Node child:curr.children)
            {
                q.add(child);
            }
        }
        
        System.out.println();
    }
  }
 
