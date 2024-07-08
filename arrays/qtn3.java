




package arrays;
import java.util.*;


public class qtn3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size elements:");
        int n = sc.nextInt();
        System.out.println("enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println();
        int min = arr[0];
        int max = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
            int avg =  sum / arr.length;


            System.out.println("min element:" + min);
            System.out.println("max element:" + max);
            System.out.println("sum:" + sum);
            System.out.println("avg:" + avg);


        }
    }
}
