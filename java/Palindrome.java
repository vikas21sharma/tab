class Palindrome
{
    public static void main(String args[])
    {
        int temp,num,cpy,a=0;
        num=18381;
        cpy=num;
        while(num!=0)
        {
            temp=num%10;
            a=temp+a*10;
            num=num/10;
        }
        if(a==cpy)
        {
            System.out.println("number is palindrom "+a);
        }
        else
        System.out.println("number is not palindrom "+a);
    }
}