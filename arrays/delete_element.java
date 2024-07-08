package arrays;
import java.util.*;

public class delete_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n =sc.nextInt();

        int [] arr= new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the position (1 to " + n + ") to delete the element: ");
        int position = sc.nextInt();

    if(position>n){
        System.out.println("invalid postion");
    }
    else{
        int newArr[]=new int[n-1];
        for(int i=0,j=0;i<n;i++){
            if(i!=position-1){
                newArr[j++]=arr[i];
            }
        }
        System.out.println("after deleting:");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
    }

    }
}
