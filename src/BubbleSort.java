
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] Args){
    Scanner in = new Scanner(System.in);
        //
        System.out.println("Enter array length:");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.println("enter array values:");
        //fill arry

        for(int i = 0; i < n; i++){

            num[i] = in.nextInt();
        }

        //check origonal

        for(int v : num){
            System.out.println(v);
        }

        System.out.println("Now sorting...");
        //bubble sort
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++)
                {
                if(num[j] > num[j+1])
                    {
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
            }
        }
    }
        
        
        System.out.println("Now sorted");
        for(int v : num){
            System.out.println(v);
        }

}
}
