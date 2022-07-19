/*Widening Casting (automatically) - converting a smaller type to a larger type size.
 byte -> short -> char -> int -> long -> float -> double.

Narrowing Casting (manually) - converting a larger type to a smaller size type.
 double -> float -> long -> int -> char -> short -> byte.*/

 //11	Write a program to show the use of typecasting.

 class WideningCasting
 {
     int a=30;
     double dl=a;
 }
 class NarrowingCasting
 {
     double dl=3923.322;
     int a=(int)dl;
 }
 class No11
 {
     public static void main(String args[])
     {
        System.out.println("Name:- vikas Sharma\nReg No.:- 211020033");
         WideningCasting obj=new WideningCasting();
         NarrowingCasting obj1=new NarrowingCasting();
         System.out.println("value of a widening= "+obj.a);
         System.out.println("value of int to double"+obj.dl);
         System.out.println("");
         System.out.println("value of dl In Narrowing="+obj1.dl);
         System.out.println("Narrowing casting double to int="+obj1.a);
     }
 }
