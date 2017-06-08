import java.util.*;
public class Reverse
{
    public static void main(String arr[])
    {
        String s;
        int i,j,size;
        Scanner d=new Scanner(System.in);
        s=d.next();
        char c[]=s.toCharArray();
        size=c.length;
        char array2[]=new char[c.length];
        for(i=0,j=size-1;(i<c.length)&&(j>=0);i++,j--)
        {
        array2[i]=c[j];
        
         }
         String s1=String.valueOf(array2);
         System.out.println(array2);
         
}
}
