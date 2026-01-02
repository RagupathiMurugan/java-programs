import java.util.*;
public class pairsum {
public static void main(String[]arg) 
{
    int a[]={2,3,4,5};
    System.out.println(Arrays.toString(a));
    int k=7;
    boolean ans=pair(a,k);
    System.out.println(ans);


}
public static boolean pair(int []a,int  k)
{
  for (int i=0;i<a.length-1;i++)
    {
    for(int j=i+1;j<a.length;j++)
    {
     
        //System.out.print("("+a[i]+","+a[j]+")");
        if(a[i]+a[j]==k)
            {
           // System.out.print("("+a[i]+","+a[j]+")");
            return true;
        }
    }
    
    
}
return false;
}

}   


