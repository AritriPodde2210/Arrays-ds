package arrays;

 import java.util.*;
public class rotatearray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter values");
        for(int i=0;i<=n-1;i++)
            a[i]=sc.nextInt();


        int temp=a[n-1];
        for(int i=n-1;i>=1;i--)
            a[i]=a[i-1];
        a[0]=temp;
        System.out.println("the values are");
        for(int i=0;i<=n-1;i++)
            System.out.print(a[i]+" ");

    }
}