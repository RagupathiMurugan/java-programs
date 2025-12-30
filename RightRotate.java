import java.util.*;
public class RightRotate {
public static void main(String[]arg)
{
int a1[]={1,2,3,4,5,6,7};
int k=a1[a1.length-1];
for(int i=a1.length-2;i>=0;i--)
    {
      a1[i+1]=a1[i];
    }
    a1[0]=k;
    System.out.print(Arrays.toString(a1));


}    
}
