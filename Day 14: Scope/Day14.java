import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference() {
        int maxDiff = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int valAbs = Math.abs(elements[i] - elements[j]);
                if (valAbs > maxDiff) {
                    maxDiff = valAbs;
                }
            }
        }
        
        this.maximumDifference = maxDiff;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Difference difference = new Difference(a);
        difference.computeDifference();

        System.out.println(difference.maximumDifference);

        scanner.close();
    }
}
