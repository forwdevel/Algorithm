
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person(scanner.next(), scanner.next(), scanner.next());

        System.out.println(person);

        scanner.close();
    }
}

class Person {
    private String name;
    private String num;
    private String address;

    Person(String name, String num, String address) {
        this.name = name;
        this.num = num;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name : " + name + "\ntel : " + num + "\naddr : " + address;
    }
}