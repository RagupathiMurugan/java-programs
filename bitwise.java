import java.util.*;
public class bitwise {
public static void main(String[]arg)
{
    int a[]={1,2,2,0,4,4,1};
    int ans=0;
    for(int i=0;i<a.length;i++)
    {
        ans=ans^a[i];
    }
    System.out.print(ans);
}    
}
