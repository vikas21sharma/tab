class WrapClass
{
    public static void main(String args[])
    {
        Integer i1=Integer.valueOf("101010",2);
        Double d1=Double.valueOf("3.2323");

        int a=Integer.parseInt("234");
        double d=Double.parseDouble("23423.23");

        int c=i1.value();
        System.out.println("  " +c);
        // System.out.println("val of a: "+a);
        // System.out.println("val of i1: "+l1);
        // System.out.println("val of d1: "+a);
    }
}