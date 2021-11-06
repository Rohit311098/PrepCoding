static int tilt = 0;
  public static int tilt(Node root){
      
      if(root==null)
      {
          return 0;
      }
      
      int sum=root.data;
      int left_sum=tilt(root.left);
      
      int right_sum=tilt(root.right);
      
      int curr_tilt=Math.abs(left_sum-right_sum);
      
      
      tilt+=curr_tilt;
      
      sum+=left_sum+right_sum;
      return sum;
    
  }
  
  public static  class Tiltpair
  {
      int tilt;
      int sum;
      int total_tilt;
      
    //   Tiltpair()
    //   {
    //       this.tilt=0;
    //       this.sum=0;
    //   }
      Tiltpair(int tilt,int sum)
      {
          this.tilt=tilt;
          this.sum=sum;
      }
  }
  
  public static Tiltpair gettilt(Node root)
  {
      if(root==null)
      {
          return new Tiltpair(0,0);
      }
      
      Tiltpair curr_node=new Tiltpair(0,root.data);
      
      Tiltpair left_side=gettilt(root.left);
      
      Tiltpair right_side=gettilt(root.right);
      
      curr_node.tilt=Math.abs(left_side.sum-right_side.sum);
      
      curr_node.total_tilt=curr_node.tilt+left_side.total_tilt+right_side.total_tilt;
      
      curr_node.sum+=left_side.sum+right_side.sum;
      
      return curr_node;
  }
