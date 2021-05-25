import java.io.*;
class Pgm_IO
{
public static void main(String args[]) throws Exception
{

char c; 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter the details:");
c=(char) br.read();
 String str=br.readLine();
System.out.println("Entered Character is :"+c);
System.out.println("Entered String is :"+str);

}
}