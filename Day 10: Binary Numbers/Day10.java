import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        int maxConsecutives = findMaxConsecutives(n);
        
        System.out.println(maxConsecutives);
        
        scanner.close();
    }
    
    public static int findMaxConsecutives(int n) {
        String binary = Integer.toBinaryString(n);
        String[] groups = binary.split("0");
        
        int maxLength = 0;
        for (String group : groups) {
            maxLength = Math.max(maxLength, group.length()); 
        }
        
        return maxLength;
    }
}
