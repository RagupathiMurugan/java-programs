import java.util.*;
public class missing {
public static void main(String[]arg) 
{
    int a[]={1,5,3,2};
   int sum=0;
   int n=a.length+1;
    for(int i=0;i<a.length;i++)
    {
    sum=sum+a[i];
    }
    int e=(n*(n+1))/2;
    System.out.println(e-sum);
    
}   
}
