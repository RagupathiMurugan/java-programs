import java.util.*;
public class evenarray {
public static void main(String[] args) {
    int a[]={2,3,9,18,20,32,15,80,77,43,22};
    int c=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]%2==0)
        {
            System.out.print(a[i]+" ");
            c++;

        }
    }
    System.out.println();
    System.out.println("Total count Even : "+c);
}    
}
