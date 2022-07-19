public class ThrowFinalThrows  
{    
    static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }  
    public static void main(String args[])  
    {  
        System.out.println("Name:- Vikas Sharma \n Reg No:- 211020033");
        try  
        {  
            method();  
        }  
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        } 
        finally 
        {  
            System.out.println("caught in main() method");  
        } 
    }  
}  