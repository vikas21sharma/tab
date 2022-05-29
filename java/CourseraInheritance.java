class Coursera
{
    int x=10,y=20,z;
    public int  number()
    {
        z=(x+y)*2;
        return z;
    }
    public void output()
    {
        System.out.println(z);
    }
}
class program extends Coursera
{
    public void output()
    {
        int x=10,y=19;
        int c= x+y;
        System.out.println(c);
    }
}
class CourseraInheritance
{
public static void main(String args[])
    {
        program obj=new program();
        obj.number();
        obj.output();
    }
}