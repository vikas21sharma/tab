/*4	Write a program to display Java is an object-oriented programming language
using command line arguments.*/
class No4
{
    public static void main(String args[])
    {
        int i;
        for(i=0;i<args.length;i++)
        {
            String st1=args[i];
            System.out.println(st1);
        }
        //int i=args.length;
       // System.out.print("length is: "+i);
    }
}