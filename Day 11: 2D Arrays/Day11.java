import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        
        // Leitura dos dados
        for (int i = 0; i < 6; i++) 
            for (int j = 0; j < 6; j++) 
                arr[i][j] = scanner.nextInt();
        
        int maxSum = -63;
        
        // Calculo da soma das ampulhetas
        for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]  // Topo
                        + arr[i+1][j+1]  // Meio
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];  // Base
                
                maxSum = Math.max(maxSum, sum);
            }
        
        System.out.println(maxSum);
    }
}
