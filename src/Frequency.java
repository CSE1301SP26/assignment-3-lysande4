import java.util.Scanner;
public class Frequency {
    public static void main(String[] Args){

        System.out.println("How many dice?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Times each value was rolled with " + n + " dice over 1000 rolls.");

        //create a bin for each number
        int[] rolls = new int[(n*5 + 1)];
        //roll die

            for(int i = 0;i < 1000; i++){
                int sum = 0;

                for(int j = 0;j < n;j++){
                    sum += (int)((Math.random() * 6) + 1);
                }

                rolls[sum-n] += 1;
            }
            for(int i = 0; i < (n*5 + 1); i++){
                System.out.println((i + n) + ": " + rolls[i]);
            }
    }
}
