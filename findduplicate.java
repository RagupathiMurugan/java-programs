import java.util.*;
public class findduplicate {
public static void main(String[]arg)
{
    int a[]={8,1,5,2,3,1,5};
    //int a[]={8,1,5,2,3,7,6};
    int k=duplicate(a);
    System.out.print(k);
    
}
public static int duplicate(int[] a)
{
    
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if(a[i]==a[j])
        
        {
            
            return a[i];
        }
    }
}
return -1;

   
}

}    


