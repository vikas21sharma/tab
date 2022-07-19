import java.util.*;
class Rect_val
{
    double len,b,h;
    public void volume(double len)
    {
        System.out.println("val of cube "+(len*len*len));
    }
    public void volume(double len, double h, double b)
    {
        System.out.println("vool of rectange "+(len*h*b));
    }
}
class Volume
{
    public static void main(String a[])
    {
        System.out.println("Name:-vikas sharma \n Reg no:- 211020033");
        Scanner sc = new Scanner(System.in);
        Rect_val obj=new Rect_val();
        double len,b,h;
        System.out.println("Enter the side of Cube :  ");
        len=sc.nextDouble();
        obj.volume(len);
        System.out.println("Enter the Side of Rectangle : ");
        b=sc.nextDouble();
        h=sc.nextDouble();
        len=sc.nextDouble();
        obj.volume(len,b,h);
    }
}