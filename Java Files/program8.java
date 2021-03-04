
/**
 * Write a description of class program8 here.
 * sum separately positive and negative numbers
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class program8
{
     public static void main(int n) throws IOException
   {
       BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
       int i=1,sumpos=0,sumneg=0;
       System.out.println("Input "+n+" numbers: ");
          while(i<=n)
            {
                int a=Integer.parseInt(stdin.readLine());
                if(a>=0)
                sumpos=sumpos+a;
                else
                sumneg=sumneg+a;
                i++;
            }
            System.out.println("sum of positive numbers= "+sumpos);
            System.out.println("sum of negative numbers= "+sumneg);
        }
                
}
