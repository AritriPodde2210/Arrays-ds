package arrays;
import java.util.*;

public class arrayoperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be stored in the array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] c = new int[n1 + n2];


        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                c[k] = arr1[i];
                i++;
                k++;
            } else {
                c[k] = arr2[j];
                k++;
                j++;
            }
        }


        while (i < n1) {
            c[k] = arr1[i];
            i++;
            k++;
        }


        while (j < n2) {
            c[k] = arr2[j];
            k++;j++;
        }


        System.out.print("Merged sorted array: ");
        for ( i=c.length-1;i>=0;i--) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
