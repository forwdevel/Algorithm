
// For Algorithm submit template
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] person = new Person[3];

        for (int i = 0; i < 3; i++) {
            person[i] = new Person();
            person[i].setName(scanner.next());
            person[i].setNum(scanner.next());
            person[i].setAddress(scanner.next());
        }

        scanner.close();

        Arrays.sort(person, new CompareName());

        System.out.println(person[0]);

    }
}

class Person {
    private String name;
    private String num;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "name : " + name + "\ntel : " + num + "\naddr : " + address;
    }
}

class CompareName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
