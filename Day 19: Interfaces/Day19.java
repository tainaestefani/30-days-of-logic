import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        AdvancedArithmetic calculator = new Calculator();
        int sum = calculator.divisorSum(n);
        System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
