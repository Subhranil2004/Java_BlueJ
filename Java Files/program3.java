
/**
 * Write a description of class program3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class program3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a string");    
        String s=stdin.readLine();
        s=s+" ";
        int l=s.length();
        String s1=" ";
        for(int i=0;i<l;i++)
        {
            char ab=s.charAt(i);
            if(ab!=32)
            s1=s1+ab;
            else
            {
               System.out.println(s1);
               s1=" ";
            }
        }

}
}
