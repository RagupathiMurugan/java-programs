import java.util.Scanner;
class tamil
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args)
    {
      System.out.print("enter the size of the array : ");
      int n = sc.nextInt();
      int b[] = new int [n];
      System.out.print("enter the elements : ");
      for(int i=0; i<n; i++)
      {
        b[i] = sc.nextInt();
      }
      int l=Integer.MIN_VALUE;
      int k=Integer.MAX_VALUE;
      for (int i=0; i<n; i++)
      {
        if(l<b[i])
        {
          l=b[i];
        }
        if(k>b[i])
        {
          k=b[i];
        }
      }
      System.out.println(l+" ");
      System.out.println(k+" ");

    }
}