class NestedTryCatch
{
    public static void main(String args[])
    {
        System.out.println("Name:- Vikas Sharma \n Reg No. 211020033"); try {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println(a[5]);
    try {
        int x = a[2] / 0;
    }
    catch (ArithmeticException e2) { System.out.println("division by zero is not possible");
    }
    }
    catch (ArrayIndexOutOfBoundsException e1) { System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println("Element at such index does not exists");
    }
    }
}