class Construct
{
    double l,b,h;
    Construct(double l)
    {
        this.l=l;
    }
    Construct(double l,double b,double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    void volume_Cube()
    {
        System.out.println("Value of Cube : "+(l*l*l));
    }
    void volume_rect()
    {
        System.out.println("volume of rect : "+(l*b*h));
    }
}
class Volume_Constructor
{
    public static void main(String a[])
    {
        System.out.println("Name:- Vikas Sharma \n Reg No:- 211020033");
        double l,b,h;
        l=10;
        b=20;
        h=30;
        Construct obj = new Construct(l);
        obj.volume_Cube();
        Construct obj2 = new Construct(l,b,h);
        obj2.volume_rect();
    }
}