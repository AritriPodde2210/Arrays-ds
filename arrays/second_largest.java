package arrays;
import java.util.*;

public class second_largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n =sc.nextInt();

        int [] arr= new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int largest = arr[n-1];
        int secondlargest = -1;
        boolean found= false;

        for (int i = n-2; i >=0; i--) {
            if (arr[i] != largest) {
                secondlargest = arr[i];
                found = true;
                break;
            }
        }


        if (found) {
            System.out.println("Second largest element in the array is: " + secondlargest);
        } else {
            System.out.println("No second largest unique element found. All elements may be identical.");
        }
    }
}