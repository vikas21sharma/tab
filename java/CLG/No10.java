//10	Write a program to reverse the digits of a numbers.
class No10
{
    public static void main(String args[])
    {
        int rev=0,a,reminder=0,no;
        no=Integer.parseInt(args[0]);
        for(int i=1;i<=no;i++)
        {
            reminder=no%10;
            rev=rev*10+reminder;
            no=no/10;
        }
        System.out.print(rev);
    }
}