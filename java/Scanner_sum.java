import java.util.*;
class Scanner_sum
{
	public static void main(String args[ ]) 
	{
	int a,b,s;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two numbers");
	a = input.nextInt();
    b = input.nextInt();
    s=a+b;
    System.out.println("Sum is:"+s);
    }
}