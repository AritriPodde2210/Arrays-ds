package arrays;
import java.util.*;

public class queue_imp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int r=-1,f=-1;
        int loop=0;
        while(loop<1){
            System.out.println("enter 1 for insert:");
            System.out.println("enter 2 for delete:");
            System.out.println("enter 3 for display:");
            System.out.println("enter 4 for exit:");

            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    if(r==n-1){

                        System.out.println("queue is full");
                    }else {
                        if(r==-1){
                            f=0;
                        }


                        r++;
                        System.out.println("Enter the value you want to insert:");
                        arr[r] = sc.nextInt();
                    }
                    break;

                case 2:
                    if(r==-1){
                        System.out.println("queue is empty to delete");
                    }
                    else{
                        System.out.println(arr[f]+"is being deleted");
                        f++;
                        if(f>r){
                            r=-1;f=-1;
                        }
                    }
                    break;
                case 3: //display
                    if(r==-1){
                        System.out.println("queue is empty");
                    }
                    else{
                        for(int i=f;i<=r;i++){
                            System.out.println(arr[i]);
                        }
                    }
                    break;
                case 4:
                    loop=1;
                    break;

                default:
                    System.out.println("invalid");
            }

        }
    }
}
