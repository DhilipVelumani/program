import java.util.*;
class repeat
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] str1=str.split(" ");
        char[] ch=null;
        for(int k=0;k<str1.length;k++)
        {
         ch=str1[k].toCharArray();
         for(int i=0;i<ch.length;i++)
{
          //if(ch[i]!=0)
          {
            for(int j=0;j<ch.length;j++)
                  {
                if(ch[i]==ch[j]&&i!=j)
                {
                    ch[j]='0';
                }
                        }
            if(ch[i]!='0')
            System.out.print(ch[i]);
            }        
         }
            System.out.print(" ");
        }
    }
}

