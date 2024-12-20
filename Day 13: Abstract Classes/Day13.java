import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void display();
}

class MyBook extends Book {
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();

        Book book = new MyBook(title, author, price);
        book.display();

        scanner.close();
    }
}
