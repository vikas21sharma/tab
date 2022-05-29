class StaticDemo
{
    int x;//instance variable it access by object
    static int y;//static variable it can be access by without creating obj

    void fun1()
    {

    }
    static int fun2()
    {
        //y is static variabel
        y=4;
        return y;
//we can not use x here because x is instance variable in static method we only use satic variables because static methods call without creation object
       // x=5;
    }

    //static class use only static members
    static class Example
    {
        static String country="india";
    }
}
class StaticUse
{
    public static void main(String args[])
    {
       // StaticDemo.y=5;
        System.out.println(StaticDemo.y);
        StaticDemo.fun2();
        System.out.println(StaticDemo.fun2());


        //object for instance variable
        StaticDemo obj=new StaticDemo();
        //obj.x = 29;
        System.out.println(obj.x);

        //Static class member access
        System.out.println(StaticDemo.Example.country);
    }
}