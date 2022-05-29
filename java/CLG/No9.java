//9	Write a program to calculate & print first n Fibonacci numbers.
class No9{
    public static void main(String args[])
    {
        int temp=0,sum=1,no,i,a;
        no=Integer.parseInt(args[0]);
        System.out.print(sum);
        for(i=2;i<no;i++)
        {
            a=temp+sum;
            System.out.print(" "+a);
            temp=sum;
            sum=a;
        }
    }
}