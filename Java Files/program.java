
/**
 * Write a description of class aa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class program
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input two characters:");
        char ab=(char)stdin.read();
        // System.out.println("Input two characters:");
        char cd=(char)stdin.read();
        int sum=ab+cd;
        int difference=ab-cd;
        System.out.println("sum of ASCII values of "+ab+" and "+cd+" = "+sum);
        System.out.println("difference of ASCII values of "+ab+" and "+cd+" = "+difference);
    }
}
