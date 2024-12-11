import java.util.Scanner;

public class Solution {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
             return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        if (n >= 2 && n <= 12) {
            System.out.println(factorial(n));
        }

        scanner.close();
    }
}
