import java.util.*;
public class zerofirst {
public static void main(String[]arg) 
{
    int a[]={1,1,0,1,0,0,1,0,1,0};
    int i=0,j=0;
    int n=a.length;
    while(j<n)
    {
        if(a[j]==1 )//go one for last
        {
            j++;
        }
        else{
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j++;
        }
    }
   System.out.print(Arrays.toString(a));
}
}

