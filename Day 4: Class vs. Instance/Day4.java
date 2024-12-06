import java.util.Scanner;

public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void yearPasses() {
        this.age++;
    }
    
    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int age = scanner.nextInt();
            Person person = new Person(age);
            person.amIOld();
            
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
            System.out.println();
        }
        scanner.close();
    }
}
