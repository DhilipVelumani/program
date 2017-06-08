import java.util.*;
public class Duplicates
{
    public static void main(String arr[])
    {
        int num,i,j,count=1,flag=0;
        
        Scanner d=new Scanner(System.in);
        num=d.nextInt();
       
        int array[]=new int[num];
        for(i=0;i<array.length;i++)
        {
        
           array[i]=d.nextInt();
          
        } 
      
        for(i=0;i<array.length;i++)
        {
            for(j=0;j<array.length;j++)
            {
                if(array[i]==array[j]&&i!=j)
                {
                       System.out.println(array[i]);
                       count=0;
                }
                
            }
    
        }
        if(count!=0)
        {
             System.out.println("no repated numbers in array");
        }
       
    }
}

