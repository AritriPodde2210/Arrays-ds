package arrays;
import java.util.*;
public class concat_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first arr size:");
        int n1=sc.nextInt();
        int[]arr1= new int[n1];
        System.out.println("enter the no of elements of first arr:");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size:");
        int n2 = sc.nextInt();
        int[]arr2= new int[n2];
        System.out.println("enter the no of elements of second arr:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int c[]=new int[n1+n2];
        for(int i=0;i<=n1-1;i++)
            c[i]=arr1[i];

        for(int i=0;i<n2;i++)
            c[n1+i]=arr2[i];

        System.out.println("elements are:");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }

    }
}
