public class New4
{
    public static boolean booleanMethod(int num)
    {
        if(num>20)
        return true;
        else
        return false;
    }
    public static void main(String a[])
    {
        No2 b1 = new No2();
        No2 b2 = new No2();
        boolean result = (b1==b2);
        System.out.println("Name:- vikas Sharma\nReg No.:- 211020033");
        System.out.println("is obj are equal ? "+result);

        System.out.println(booleanMethod(30));
        
        int num1=10;  
        int num2=20;  
        boolean bl1=true; 
        boolean bl2=false;  
        if(num1>num2 && num1==num2)  
        {  
            System.out.println(bl2);  
        }  
        else  
        {  
             System.out.println(bl1);  
        }          
    }
}