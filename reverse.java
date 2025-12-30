import java.util.*;
class reverse
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args)
    {
     int n=sc.nextInt();
     int a1[]=new int[n];
     for(int i=0;i<n;i++)
     {
        a1[i]=sc.nextInt();
     }
     int start=0;
     int end=a1.length-1;
    while(start>end)
    {
        int t=a1[start];
        a1[start]=a1[end];
        a1[end]=t;
        start++;
        end--;
    }
   return start;
}
}