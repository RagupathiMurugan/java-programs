import java.util.*;
public class swapalter {
public static void main(String[]arg) 
{
    int a[]={5,6,10,12,15,16};
    System.out.println(Arrays.toString(a));
    for(int i=0;i<a.length-1;i=i+2)
    {
    int temp=a[i];
    a[i]=a[i+1];
    a[i+1]=temp;
}
System.out.println(Arrays.toString(a));

}   
}

