
package index;
import java.util.*;
import java.util.Arrays;
public class Index 
{
public static void main(String[] args) 
{
    Scanner d=new Scanner(System.in);
    int n=d.nextInt();
    
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=d.nextInt();
       
    }
   Arrays.sort(arr);
     for(int i=0;i<n;i++)
    {
       
        System.out.println(arr[i]);
    }
    int m=d.nextInt();
    int t=m-1;
    if(m==arr[t])
    {
        
        System.out.print(arr[m-1]);
    }
    else
    {
                System.out.println("not found");

    }
 }
    
}
