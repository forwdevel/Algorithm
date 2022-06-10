
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student_1 = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt());
        Student student_2 = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt());

        System.out.println(student_1);
        System.out.println(student_2);
        System.out.println("avg " + (student_1.getKor() + student_2.getKor()) / 2 + " "
                + (student_1.getEng() + student_2.getEng()) / 2);

        scanner.close();
    }
}

class Student {
    private String name;
    private int kor;
    private int eng;

    Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public int getEng() {
        return eng;
    }

    public int getKor() {
        return kor;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + eng;
    }
}