import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        
        HashMap<Character,Integer> h=new HashMap<>();
        
        for(int i=0;i<str.length();i++)
        {
            if(h.containsKey(str.charAt(i)))
            {
                int freq=h.get(str.charAt(i));
                
                h.put(str.charAt(i),freq+1);
            }
            else
            {
                h.put(str.charAt(i),1);
            }
        }
        
        int max_freq=Integer.MIN_VALUE;
        Character c=null;
        for(Character i:h.keySet())
        {
            if(h.get(i)>max_freq)
            {
                max_freq=h.get(i);
                c=i;
            }
        }
        
        System.out.println(c);
    }

}
