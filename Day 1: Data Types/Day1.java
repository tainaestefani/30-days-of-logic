import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scanner = new Scanner(System.in);
        
        int intVar = scanner.nextInt();
        double doubleVar = scanner.nextDouble();
        scanner.nextLine();
        String stringVar = scanner.nextLine();
        
        System.out.println(i + intVar);
        System.out.println(d + doubleVar);
        System.out.println(s + stringVar);
    
        scanner.close();
    }
}
