//TC-O(N) SC-O(1)
 public int trap(int[] arr) {
        
        int left=0,right=arr.length-1;
        
        int leftmax=0,rightmax=0;
        
        int water=0;
        while(left<=right)
        {
            if(arr[left]<=arr[right])
            {
                if(arr[left]<leftmax)
                {
                    water+=leftmax-arr[left];
                }
                else
                {
                    leftmax=arr[left];
                }
                
                left++;
            }
            else
            {
               if(arr[right]<rightmax)
                {
                    water+=rightmax-arr[right];
                }
                else
                {
                    rightmax=arr[right];
                }
                right--;
            }
        }
        
        return water;
        
    }
