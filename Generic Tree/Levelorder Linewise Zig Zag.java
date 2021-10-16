public static void levelOrderLinewiseZZ(Node root){
    
    Stack<Node> mains=new Stack<Node>();
    
    mains.push(root);
    
    int counter=0;
    while(mains.size()>0)
    {
        Stack<Node> childs=new Stack<Node>();
        
        while(mains.size()>0)
        {
            Node curr=mains.pop();
            
            System.out.print(curr.data+" ");
            if(counter%2==0)
            {
                for(int i=0;i<curr.children.size();i++)
                {
                    childs.push(curr.children.get(i));
                }
            }
            else
            {
                for(int i=curr.children.size()-1;i>=0;i--)
                {
                    childs.push(curr.children.get(i));
                }
                
            }
        }
        counter++;
        
        mains=childs;
        System.out.println();
    }
    
  }
