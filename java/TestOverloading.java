class Adder
{

int add(int a,int b, int c)
{
return a+b+c;
}
double add(double a, double b)
{
 return a+b;
}
}
class TestOverloading
{
public static void main( String args[])
{
Adder adder=new Adder();
System.out.println(adder.add(11,11));

System.out.println(adder.add(11,11,11));

System.out.println(adder.add(11.34,11.56));
}
}