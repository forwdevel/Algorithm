
// For Algorithm submit template
import java.util.Scanner;

class Main {
    final static double PI = 3.141592;

    public static double area(double r) {
        return Math.round(r * r * PI * 1000) / 1000.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("radius : ");
        double r = scanner.nextDouble();

        System.out.println("area = " + area(r));

        scanner.close();
    }
}