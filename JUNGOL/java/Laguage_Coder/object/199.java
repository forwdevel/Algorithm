
// For Algorithm submit template
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] student = new Student[scanner.nextInt()];

        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].setName(scanner.next());
            student[i].setScore_1(scanner.nextInt());
            student[i].setScore_2(scanner.nextInt());
            student[i].setScore_3(scanner.nextInt());
            student[i].setTotal();
        }

        Arrays.sort(student, new CompareTotal());

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }

        scanner.close();
    }
}

class Student {
    private String name;
    private int score_1;
    private int score_2;
    private int score_3;
    private int total;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore_1(int score_1) {
        this.score_1 = score_1;
    }

    public void setScore_2(int score_2) {
        this.score_2 = score_2;
    }

    public void setScore_3(int score_3) {
        this.score_3 = score_3;
    }

    public void setTotal() {
        this.total = score_1 + score_2 + score_3;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return name + " " + score_1 + " " + score_2 + " " + score_3 + " " + total;
    }
}

class CompareTotal implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int temp = o1.getTotal() - o2.getTotal();
        if (temp > 1) {
            return -1;
        }
        if (temp < 1) {
            return 1;
        }
        return 0;
    }

}