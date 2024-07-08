package arrays;
import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size:");
        int n = sc.nextInt();
        System.out.print("enter the no of elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int mid1 = (n-1)/2;
        int mid2= n/2;
        if(n%2==1) {
            System.out.println("middle most element:" + arr[mid1]);
        }
        else{
            System.out.println("middle most element:"+arr[mid1]+ "and" +arr[mid2]);


        }
    }
}

