
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Square square_1 = new Square(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Square square_2 = new Square(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        scanner.close();

        Square result = new Square(
                (square_1.getX1() < square_2.getX1()) ? square_1.getX1() : square_2.getX1(),
                (square_1.getY1() < square_2.getY1()) ? square_1.getY1() : square_2.getY1(),
                (square_1.getX2() > square_2.getX2()) ? square_1.getX2() : square_2.getX2(),
                (square_1.getY2() > square_2.getY2()) ? square_1.getY2() : square_2.getY2());

        System.out.println(result);
    }
}

class Square {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    Square(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    @Override
    public String toString() {
        return x1 + " " + y1 + " " + x2 + " " + y2;
    }
}