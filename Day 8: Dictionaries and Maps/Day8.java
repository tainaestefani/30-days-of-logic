import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, String> phoneBook = new HashMap<>();
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String number = scanner.next();
            phoneBook.put(name, number);
        }
        
        while (scanner.hasNext()) {
            String query = scanner.next();
            String result = phoneBook.get(query);
            System.out.println(result != null ? query + "=" + result  : "Not found");
        }
        
        scanner.close();
    }
}
