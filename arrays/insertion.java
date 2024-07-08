package arrays;
import java.util.*;

public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k ,i,j=0;

        System.out.print("enter the size:");
        int n = sc.nextInt();
        System.out.print("enter the no of elements:");
        int [] arr = new int[n];
        int []b = new int[n+1];
        for( i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value to insert:");
        int val = sc.nextInt();
        for( i=0,j=0;i<=b.length-1;i++){
            if(arr[j]<val){
                b[i]=arr[j];
                j++;
            }
            else{
                b[i]=val;
                break;

            }

        }
        i++;

        for( k=j;k<=arr.length-1;k++ ){ // remaining value with inserted value
            b[i]=arr[k];
            i++;


        }
        System.out.println("the final array:");
        for( i=0;i<=b.length-1;i++){
            System.out.print(b[i]+" ");
        }
    }
}
