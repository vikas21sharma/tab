class ReverseOfArr
{
    public static void main(String args[])
    {
        int i,j;
        int a[]=new int[5];
        int b[]=new int[5];
        int n=a.length;
        //System.out.println("valu from b :  "+b);
        for(i=0;i<args.length;i++)
        {
        System.out.println(" "+args[i]);
        a[i] = Integer.parseInt(args[i]);
        }
       // System.out.println("valu from a :  "+a[i]);
        System.out.println("Reverse of Array is :  ");
        for(i=0;i<a.length;i++)
        {
            b[n-1]=a[i];
            n=n-1;
        }
        for(i=0;i<a.length;i++)
        System.out.println("reverses values are :  "+b[i]);
    }
}