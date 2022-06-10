
// For Algorithm submit template
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] person = new Person[5];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            person[i].setName(scanner.next());
            person[i].setHeight(scanner.nextInt());
            person[i].setWeight(scanner.nextDouble());
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("name");
        Arrays.sort(person, new CompareName());

        for (int i = 0; i < 5; i++) {
            System.out.println(person[i].toString());
        }

        System.out.println("\nweight");
        Arrays.sort(person, new CompareWeight());

        for (int i = 0; i < 5; i++) {
            System.out.println(person[i].toString());
        }

        scanner.close();
    }
}

class Person {
    private String name;
    private int height;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}

class CompareName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class CompareWeight implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        double temp = o1.getWeight() - o2.getWeight();

        if (temp > 0.00001)
            return -1;
        if (temp < 0.00001)
            return 1;
        return 0;

    }

}