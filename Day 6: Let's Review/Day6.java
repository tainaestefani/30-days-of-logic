import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine();
        
        for (int t = 0; t < T; t++ ) {
            String s = scanner.nextLine();
            String even = "", odd = "";
            
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even += s.charAt(i);
                } else {
                    odd += s.charAt(i);
                }
            }
            
            System.out.println(even + " " + odd);
        }
        
        scanner.close();
    }
}
