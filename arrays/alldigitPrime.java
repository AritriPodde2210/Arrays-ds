package arrays;
import java.util.*;

public class alldigitPrime {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("numbers with all prime digits:");
        for(int i=0;i<arr.length;i++){
            int number=arr[i];
            int temp=number;
            boolean isAllprimeDigits = true;
            while(temp>0){
                int digit=temp%10;
                if(!(digit==2||digit==3||digit==5||digit==7)){
                    isAllprimeDigits =false;
                    break;
                }
                temp/=10;
            }
            if(isAllprimeDigits){
                System.out.println(number);
            }

        }
    }
}
