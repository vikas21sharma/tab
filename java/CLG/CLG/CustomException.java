class MyException extends Exception
{

}
public class CustomException
{
public static void main(String args[])
{
System.out.println("Name :- Vikas Sharma \n Reg no:- 211020033");
try {
throw new MyException();
}
catch (MyException ex)
{
System.out.println("Caught"); 
System.out.println(ex.getMessage());
}
}
}
