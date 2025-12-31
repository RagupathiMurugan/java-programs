import java.util.*;
public class PosNeg {
public static void main(String[]arg) 
{
    int a[]={2,-3,5,-6,-7,8,10};
    System.out.println(Arrays.toString(a));
    int i=0;
    int j=a.length-1;
    while(i<j)
    {
        if(a[i]>0 && a[j]>0)
        {
            j--;
        }
        else if (a[i]<0 && a[j]<0)
        {
            i++;
        }
        else if(a[i]<0 && a[j]>0)
        {
            i++;
            j--;
        }
        else{
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;

        }
    }
    

System.out.println(Arrays.toString(a));

}   
}

