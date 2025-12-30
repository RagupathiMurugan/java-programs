import java.util.*;
public class secondmax {
public static void main(String[]arg) 
{
    int a[]={2,4,8,10,9,5,6,10};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;

    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        {
            smax=max;
            max=a[i];
        }
       if(smax<a[i] && a[i]!=max)
        {
            smax=a[i];
        }
    }
    System.out.println("Second maxi "+smax);
    System.out.println("First maxi "+max);
}   
}
