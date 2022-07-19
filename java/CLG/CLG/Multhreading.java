import java.lang.*;  
class A extends Thread   
{  
public void run()  
{  
    int i;
    for(i=1;i<=10;i++)
    {
        System.out.println("i = "+i +"Threa A Class");
    }
    }
}
class B extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("i = "+i + "Thread b Cals");
        }
    }
}
class Multhreading 
{  
    public static void main(String argvs[])  
    {  
        System.out.println("Vikas Shrama \n 211020033");
        A obj = new A();
        B obj1 = new B();
        obj.start();
        obj1.start();
}  
}