package teacherarrobject.java;

import java.util.Scanner ;
class EmployeeT
{
int empid ;
String name ;
float salary ;
String address ;
EmployeeT ( ) { }
EmployeeT ( int empid , String name , float salary , String address ){
this . empid = empid ;
this . name = name ;
this . salary = salary ;
this . address = address ;
}
}
class Teacher extends EmployeeT
{
    String department,subject;
    Teacher ( int empid , String name , float salary , String address,
String department , String subject)
    {
        super ( empid , name , salary, address ) ;
this . department = department ;
this . subject = subject ;
    }
    public void display ( ) 
    {
System .out. println ( "Teacher i d :"+ empid ) ;
System .out. println("Teacher name :"+ name ) ;
System .out.println( "Teacher salary :" + salary ) ;
System .out.println ("Teacher address :" + address ) ;
System .out.println ("Teacher department :" + department ) ;
System.out.println("Teacher subject :" + subject) ;
    }
}

public class TeacherArrObject
{
    public static void main (String [] args) 
    {
System . out . println ("Enter number o f teachers : " ) ;
Scanner sc = new Scanner ( System .in ) ;
int n = sc .nextInt ();
System . out . println ("Enter Teacher details one by one . . " ) ;
Teacher teacher [ ] = new Teacher [ n ] ;
Scanner scT = new Scanner ( System . in ) ;
int tid ;
String name ; float salary ; 
String address;
String department ; 
String subject;
    for( int i =0; i<n ; i++)
    {
        System . out . println (" Enter " + i + " teacher details . . " ) ;
System . out . println ( "Enter teacher id ( integer ) : ") ;
tid=scT.nextInt() ;
System . out . println("Enter teacher name (String):  ") ;
name = scT . next () ;
System . out . println ("Enter teacher salary ( float ) :") ;
salary = scT . nextFloat ( ) ;
System . out . println( "Enter teacheraddress ( S t ri n g ) :" ) ;
address = scT . next () ;
System . out . println ("Enter teacher department ( S t ri n g ) :") ;
department = scT . next() ;
System . out . println (" enter teacher subject( String ) : " ) ;
subject = scT . next() ;
Teacher t = new Teacher ( tid , name , salary , address , department ,subject ) ;
teacher [i] = t ;
    }
    System . out . println ("teachers are : \n " ) ;
for(Teacher x : teacher ){
x . display ( ) ; System . out .println ( "\n" ) ;
    }
    }
}

    


