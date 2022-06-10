
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person father = new Person(scanner.nextInt(), scanner.nextDouble());
        Person mother = new Person(scanner.nextInt(), scanner.nextDouble());

        Person child = new Person(
                (father.getHeight() + mother.getHeight()) / 2 + 5,
                Math.round(((double) father.getWeight() + mother.getWeight()) / 2 * 10) / 10.0 - 4.5);

        System.out.println(child);

        scanner.close();
    }
}

class Person {
    private int height;
    private double weight;

    Person(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "height : " + height + "cm\nweight : " + weight + "kg";
    }
}