//8	Write a program to compute the sum of digits of a given integer.
class No8
{
    public static void main(String args[])
    {
        int no,sum=0,a,temp=1,c;
        no=Integer.parseInt(args[0]);
        for(a=0;a<=no;a++)
        {
            temp=no/10;
            sum=no%10+sum;
            no=temp;
        }
        System.out.print("addin is :"+sum);
    }
}