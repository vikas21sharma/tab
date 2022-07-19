import java.util.*;
public class SimpleTryCatch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Name:- Vikas Sharma Reg No:- 211020033"); 
        try
        {
            int data=num1/num2;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
