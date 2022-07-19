public class VarScope  
{  
public static void main(String args[])   
{  
int x=10;  
{  
//y has limited scope to this block only      
int y=20;  
System.out.println("Sum of x+y = " + (x+y));  
}  
//here y is unknown   
y=100;  
//x is still known  
x=50;  

}  
}  