import java.util.*;
public class linearSearch {

public static int Linearsearch(int a1[],int a)
{
    for(int i=0;i<a1.length;i++)
    {
        if(a1[i]==a)
        {
            return i;
        }
    }
return -1;
}
public static void main(String[]arg)
{
int a1[]={1,2,3,4,5,6,7};
int a=4;
int ans=Linearsearch(a1,a);
System.out.print("Array Position = "+ans);
}    
}
