import java.util.*;
public class arrays3 {
public static void main(String[]arg)
{
    int a[]={10,11,12,13,14,15};
    for(int i=0;i<a.length;i++)
    {
      if(a[i]%2==0)
      {
         a[i]=a[i]+50;
      }
      else
      {
         a[i]=a[i]+100;
      }
    }
    System.out.println(Arrays.toString(a));
}    
}
