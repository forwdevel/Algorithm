import java.util.ArrayList;

// For Algorithm submit template
import java.util.*;;

class Main {
      public static void main(String[] args) {
            int[][] commands = {
                        { 2, 5, 3 },
                        { 4, 4, 1 },
                        { 1, 7, 3 }
            };

            int[] answer = new int[3];

            int[] array = { 1, 5, 2, 6, 3, 7, 4 };

            List<Integer> temp = new ArrayList<Integer>();

            for (int i = 0; i < commands.length; i++) {
                  for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                        temp.add(array[j]);
                  }

                  Collections.sort(temp);

                  answer[i] = temp.get(commands[i][2] - 1);
                  temp.clear();
            }

            // return answer;
      }
}