import java.util.*;
public class duplicateArray {
public static void main(String[]arg)
{
    int a[]={8,1,5,2,3,1,5};
    //int a[]={8,1,5,2,3,7,6};
    boolean k=duplicate(a);
    if(k==true)
    {System.out.println("Duplicate");}
    else
    {System.out.println("Not Duplicate");}
    
}
public static boolean duplicate(int[] a)
{
    int c=0;
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if(a[i]==a[j])
        
        {
            c++;
        }
        if(c>1)
        {
            return true;
        }
      }
    }
    
    return false;
}

}    

