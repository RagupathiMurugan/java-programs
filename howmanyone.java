import java.util.*;
public class howmanyone {
public static void main(String[]arg)
{
    int a[]={8,1,1,2,3,1,1,1,5};
    //int a[]={8,1,5,2,3,7,6};
    int k=checkone(a);
    System.out.print("MAXIMUM COUNT "+k);
    
}
public static int checkone(int[] a)
{
    int c=0;
    int maxc  =Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++)
    {
     
        if(a[i]==1)
        
        {
            c++;
         maxc=Math.max(c,maxc);
            
        }
        else{
            c=0;
        }
    
}
return maxc;

   
}

}    


