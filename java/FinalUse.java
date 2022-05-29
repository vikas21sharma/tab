class FinalUse
{
    private final int x;//final instance var.
    { x=4;}//initilization block
    private final int y=0;
    private final static int z;//final static var.

    static
    {
        z=4;
    }
   FinalUse()
    {x=5;}// here we can not initialize
    public void fun()
    {
        final int k;//final local var.
    }

    class Dummy
    {
        public void somefun()
        {}
    }
    // class moreDummy extends Dummy
    // {
    //     public 
    // }

    public static void main(String args[])
    {
        FinalUse obj1=new FinalUse();
    }
}