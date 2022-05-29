// To complie javac -d . Packages.java
// To complie javac -d . Packages2.java
//to run java pack1.packages2
package pack1;
import pack2.Packages;
public class packages2
{
    public static void main(String args[])
    {
        Packages s1=new Packages();
        s1.setRollno(100);
        s1.setName("vikas");
        System.out.println("roll no : "+s1.getRollno());
        System.out.println("Name is :"+s1.getName());
    }
}