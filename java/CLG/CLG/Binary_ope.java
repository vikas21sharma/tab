import java.math.*;
import java.util.*;
interface binary
{
   void bin_dec(int binary);
   void dec_bin(int decimal);
   void two_comp(int binary1);
   void bin_add(int decimal1);
}
class ram implements binary
{
    public void bin_dec(int binary)
    {
        int decimal = 0;
        int n = 0;
        while(true)
        {
            if(binary == 0)
            break;
            else{
                int temp = binary%10;
                decimal +=temp*Math.pow(2,n);
                binary = binary/10;
                n++;
            }
        }
        System.out.println("Decimal val is : "+decimal);
    }
    
    public void dec_bin(int decimal)
    {
        int binary = 0;
        int n=0;
        while(decimal != 0)
        {
            if(decimal ==0)
            break;
            else{
                int temp = decimal%2;
                // binary +=temp;
                // decimal = decimal/2;
                // n++;
                double c =Math.pow(10,n);
                binary +=temp * c;
                decimal = decimal/2;
                n++;
                //System.out.println("n loop check val is : "+n);
            }
        }
        System.out.println("binary val is : "+binary);
    }
    public void two_comp(int binary1)
    {
        int n;
        for(i=n-1;)
    }
}
class Binary_ope
{
    public static void main(String a[])
    {

        ram obj = new ram();
        //int ab = Integer.parseInt(a[0]);
        System.out.println("Vikas Sharma\n211020033");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number : ");
        int ab = sc.nextInt();
        obj.bin_dec(ab);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter decimal number : ");
        int abc = sc1.nextInt();
        obj.dec_bin(abc);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter two's complement number to convert :");
        int two=sc2.nextInt();
        obj.two_comp(two);
    }
}