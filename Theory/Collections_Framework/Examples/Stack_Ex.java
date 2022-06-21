import java.util.Stack;

public class Stack_Ex {
      public static void main(String[] args) {
            Stack<Coin> coinBox = new Stack<Coin>();

            coinBox.push(new Coin(20));
            coinBox.push(new Coin(70));
            coinBox.push(new Coin(100));
            coinBox.push(new Coin(130));

            while (!coinBox.isEmpty()) {
                  Coin coin = coinBox.pop();
                  System.out.printf("Selected coin is %3d KRW\n", coin.getValue());
            }
      }
}

class Coin {
      private int value;

      Coin(int value) {
            this.value = value;
      }

      public int getValue() {
            return value;
      }
}