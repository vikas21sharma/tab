//15.	Write a program to sort element of an array.
class No15
{
    public static void main(String args[])
    {
        int arr[]={23,232,4,23,2,321};
        int temp,a,b,i,k,j;
        for(j=0;j<arr.length;j++)
        System.out.println("val of arr is = "+arr[j]);
        System.out.println(" ");
        for(i=0;i<arr.length;i++)
        {
            for(k=i+1;k<arr.length;k++)
            {
            if(arr[i]>arr[k])
            {
            temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            }
            
        }
        System.out.println("val of arr is="+arr[i]);
        }
        //for(int j=0;j<=arr.length;j++)
        //System.out.println("sorted is= "+arr[j]);
    }
}