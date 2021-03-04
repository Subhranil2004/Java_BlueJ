
/**
 * Write a description of class program2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class program2
{
   public static void main(int no) 
   {
       int sum=0;
       int r;
       while(no!=0)
       {
           r=no%10;
           no=no/10;
           sum=sum*10+r;
        }
        System.out.println("The reverse number="+sum);
           
}
}
