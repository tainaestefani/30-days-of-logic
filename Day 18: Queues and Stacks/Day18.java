import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Solution {
    private Stack<Character> stack;
    private Queue<Character> queue;
    
    public Solution() {
        this.stack = new Stack<>();
        this.queue = new LinkedList<>();
    }
    
    public void pushCharacter(char ch) {
        stack.push(ch);
    }
    
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    
    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.poll();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        Solution solution = new Solution();
        
        for (char c : s.toCharArray()) {
            solution.pushCharacter(c);
            solution.enqueueCharacter(c);
        }
        
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (solution.popCharacter() != solution.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("The word, " + s + ", is a palindrome.");
        } else {
            System.out.println("The word, " + s + ", is not a palindrome.");
        }
    }
}
