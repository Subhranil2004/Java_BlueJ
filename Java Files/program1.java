
/**
 * Write a description of class program1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  
import java.io.*;
public class program1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a character which will be replaced by its next one:");
        char ab=(char)stdin.read();
        if(ab>=65 && ab<=90)
        System.out.println((char)(ab+1));
        else if(ab>=97 && ab<=122)
         System.out.println((char)(ab+1));
         else
       System.out.println("Not an alphabet");  
    }
}
