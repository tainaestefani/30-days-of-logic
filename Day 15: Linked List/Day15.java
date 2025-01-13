import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            return newNode;
        }
        
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
        
        return head;
    }
    
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        Node head = null;

        for (int i = 0; i < T; i++) {
            int data = scanner.nextInt();
            head = insert(head, data);
        }

        display(head);

        scanner.close();
    }
}
