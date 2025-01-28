import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine().trim();
        scanner.close();
        
        try {
            int num = Integer.parseInt(S);
            System.out.print(num);
        } catch (NumberFormatException e) {
            System.out.print("Bad String");
        }
    }
}
