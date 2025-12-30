import java.util.*;
public class arrays2 {
public static void main(String[]arg)
{
 int a[]={1,2,3,4,5,6};
 System.out.println(Arrays.toString(a));
 for(int i=0;i<a.length;i++)
 {
    a[i]=a[i]+100;
    //System.out.print(a[i]+" ");
}
System.out.println(Arrays.toString(a));
}    
}
