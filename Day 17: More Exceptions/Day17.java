import java.util.Scanner;

class Calculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            int result = 1;
        
            for(int i = 0; i < p; i++) {
                result *= n;
            }
            return result;
        }  
    }
}

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Calculator calculator = new Calculator();
       
       int T = scanner.nextInt();
       
       for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try {
                int answer = calculator.power(n, p);
                System.out.println(answer);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
       }
       scanner.close();
    }
}
