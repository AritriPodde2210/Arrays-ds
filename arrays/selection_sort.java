package arrays;
import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the elements:");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //selection sort
        for (int i = 0; i<arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j <arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("sorted elements:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        }



}
