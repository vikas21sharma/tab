//Write a program to perform the addition of n nos.by taking inputs from command line. 
public class No6{
    public static void main(String args[])
    {
        int no1,no2,sum;
        no1=Integer.parseInt(args[0]);
        no2=Integer.parseInt(args[1]);
        sum=no1+no2;
        System.out.print("Sum is: "+sum);
    }
}