import java.util.Scanner;

class Person {
    String firstName;
    String lastName;
    int idNumber;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {
    private int[] scores;

    public Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.scores = scores;
    }

    public char calculate() {
        int total = 0;

        for (int score : scores) {
            total += score;
        }

        double average = (double) total / scores.length;

        if (average >= 90) {
            return 'O';
        } else if (average >= 80) {
            return 'E';
        } else if (average >= 70) {
            return 'A';
        } else if (average >= 55) {
            return 'P';
        } else if (average >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int idNumber = scanner.nextInt();

        int numScores = scanner.nextInt();

        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = scanner.nextInt();
        }

        Student student = new Student(firstName, lastName, idNumber, scores);

        student.printPerson();
        System.out.println("Grade: " + student.calculate());

        scanner.close();
    }
}
