public static int distanceBetweenNodes(Node root, int d1, int d2){
    // write your code here
    ArrayList<Integer> temp1=nodetorootpath(root,d1);
    ArrayList<Integer> temp2=nodetorootpath(root,d2);
    
     //We have to traverse both arrayList from last and comparing
     
     int i=temp1.size()-1,j=temp2.size()-1;
     
     while(i>=0 && j>=0)
     {
         if(temp1.get(i)!=temp2.get(j))
         {
           
            break;
         }
         
         i--;
         j--;
     }
     
     
     return (i+1)+(j+1);
  }
