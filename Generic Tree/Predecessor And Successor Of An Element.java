static Node predecessor;
static Node successor;
static int state=-1;
public static void predecessorAndSuccessor(Node root, int data) {
    
    if(root==null)
    {
        return;
    }
     if(state==-1)
     { 
         if(root.data==data)
        {
            state++;
        }
        else
        {
            predecessor=root;
        }
     }
    
    if(state==1)
    {
        successor=root;
        return;
    }
    
    for(Node child:root.children)
    {
        if(state==0)
        {
            state++;
        }
        predecessorAndSuccessor(child,data);
        
        if(state==1)
        {
            return;
        }
        
    }
  }
