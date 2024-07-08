package arrays;
import java.util.*;

public class split_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] even = new int[0];
        int[] odd = new int[0];
        int ep = 0, op = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                int[] temp = new int[ep + 1];
                for(int j = 0; j < ep; j++) {
                    temp[j] = even[j];
                }
                temp[ep] = arr[i];
                even = temp;
                ep++;
            } else {
                int[] temp = new int[op + 1];
                for(int j = 0; j < op; j++) {
                    temp[j] = odd[j];
                }
                temp[op] = arr[i];
                odd = temp;
                op++;
            }
        }

        System.out.println("Even array is:");
        for(int i = 0; i < ep; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd array is:");
        for(int i = 0; i < op; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
