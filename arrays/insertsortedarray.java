package arrays;
import java.util.*;

public class insertsortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();


        int[] sortedArray = new int[n];


        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            sortedArray[i] = sc.nextInt();
        }


        System.out.print("Enter the value to insert: ");
        int valueToInsert = sc.nextInt();


        int[] newArray = new int[n + 1];
        int i = 0;


        while (i < n && sortedArray[i] < valueToInsert) {
            newArray[i] = sortedArray[i];
            i++;
        }


        newArray[i] = valueToInsert;

        while (i < n) {
            newArray[i + 1] = sortedArray[i];
            i++;
        }
        System.out.println("after inserting:");
        for (i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }
        System.out.println();
    }
}
