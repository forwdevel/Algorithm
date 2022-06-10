
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] person = new Person[5];

        int minIdx = 0;

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            person[i].setName(scanner.next());
            person[i].setHeight(scanner.nextInt());
            if (person[minIdx].getHeight() > person[i].getHeight()) {
                minIdx = i;
            }
        }

        System.out.println(person[minIdx]);

        scanner.close();
    }
}

class Person {
    private String name;
    private int height;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}