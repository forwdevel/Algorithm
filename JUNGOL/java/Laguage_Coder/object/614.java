
// For Algorithm submit template
import java.util.Scanner;

class Student {
    String school;
    int grade;

    Student(String school, int grade) {
        this.school = school;
        this.grade = grade;
    }

    Student() {
        this.school = "Jejuelementary";
        this.grade = 6;
    }

    @Override
    public String toString() {
        return "" + grade + " grade in " + school + " School";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String school = scanner.next();
        int grade = scanner.nextInt();

        System.out.println(new Student());
        System.out.println(new Student(school, grade));

        scanner.close();
    }
}