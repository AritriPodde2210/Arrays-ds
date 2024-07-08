package arrays;
import java.util.*;

public class shift_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size:");
        int n = sc.nextInt();
        System.out.print("enter the no of elements:");
        int [] arr = new int[n];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int count=1;count<=2;count++) {

            int temp = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = temp;
        }
        System.out.println("the shifted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
