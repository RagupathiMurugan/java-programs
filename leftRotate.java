import java.util.*;
public class leftRotate {
public static void main(String[]arg)
{
int a1[]={1,2,3,4,5,6,7};
int k=a1[0];
for(int i=1;i<a1.length;i++)
    {
      a1[i-1]=a1[i];
    }
    a1[a1.length-1]=k;
    System.out.print(Arrays.toString(a1));


}    
}
