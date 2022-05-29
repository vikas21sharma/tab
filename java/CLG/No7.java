//7	Write a program to compute & print factorial of any given number.
class No7
{
    public static void main(String args[])
    {
        int temp=1,a;
        int inputNo=Integer.parseInt(args[0]);
        for(int i=1;i<=inputNo;i++)
        {
            temp=i*temp; 
            
        }
        System.out.print("Factorial is : "+temp);
    }
}