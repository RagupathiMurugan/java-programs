import java.util.*;
public class mergeArray {
public static void main(String[]arg) 
{
    int a[]={2,4,7,9};
    int b[]={1,3,5,8,10,15,17,19,20};
    int i=0,j=0;
    int n=a.length;
    int m=b.length;
    int ans[]=new int[n+m];
    int k=0;
    while(i<n && j<m)
    {
        if(a[i]<b[j])
        {
            ans[k]=a[i];
            k++;
            i++;

        }
        else{
            ans[k]=b[j];
            k++;
            j++;
        }
    }
        while(j<m)
        {
            ans[k]=b[j];
            k++;
            j++;
        }
        while(i<n)
        {
            ans[k]=a[i];
            k++;
            i++;
        }
    

System.out.println(Arrays.toString(ans));

}   
}

