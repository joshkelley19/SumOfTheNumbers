package SumOfTheNumbers;

import java.util.Scanner;

/**
 * Created by joshuakelley on 9/9/16.
 */
public class SumOfTheNumbers {
    public static int sum(int n){
        int ans = 0;
        for (int i = 0;i < n+1;i++){
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me a numba: ");

        int clientResponse = scanner.nextInt();

        System.out.println("The sum of the number is: " + SumOfTheNumbers.sum(clientResponse));
    }
}
