
/**
 * s=1+1/2+1/3+1/4+........+1/n
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class program7
{
  public static void main(int n)
   {
       double a=1;
       double sum=0;
       
       while(a<=n) 
       {
           sum=sum+1/a;
           a++;
        }
        System.out.println("The sum is "+sum);
    }
       
}

