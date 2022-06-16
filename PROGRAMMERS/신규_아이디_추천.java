
// For Algorithm submit template
import java.util.*;

class Main {
      public static void main(String[] args) {
            String new_id = "abcdefghijklmn.p";

            List<Character> temp = new ArrayList<Character>();
            List<Integer> idx = new ArrayList<Integer>(); // Store the index of remove targets

            // step 1
            new_id = new_id.toLowerCase();

            for (int i = 0; i < new_id.length(); i++) {
                  temp.add(new_id.charAt(i));
            }

            new_id = "";

            for (int i = 0; i < temp.size(); i++) {
                  // step 2
                  if ((temp.get(i) >= '0' && temp.get(i) <= '9') || (temp.get(i) >= 'a' && temp.get(i) <= 'z') ||
                              temp.get(i) == '-' || temp.get(i) == '_' || temp.get(i) == '.') {
                  } else {
                        idx.add(i);
                  }
            }

            for (int i = idx.size() - 1; i >= 0; i--) {
                  int t = idx.get(i);
                  temp.remove(t);
            }

            idx.clear();

            for (int i = 0; i < temp.size(); i++) {
                  // step 3
                  if (temp.get(i) == '.' && i != 0 && temp.get(i - 1) == '.') {
                        // remove target
                        idx.add(i);
                  }
            }

            for (int i = idx.size() - 1; i >= 0; i--) {
                  int t = idx.get(i);
                  temp.remove(t);
            }

            try {
                  // step 4
                  while (temp.get(0) == '.') {
                        temp.remove(0);
                  }
                  while (temp.get(temp.size() - 1) == '.') {
                        temp.remove(temp.size() - 1);
                  }
            } catch (IndexOutOfBoundsException e) {
                  if (temp.size() == 0) {
                        temp.add('a');
                  }
            }

            for (int i = 0; i < temp.size(); i++) {
                  new_id += temp.get(i);
            }

            // step 6
            if (new_id.length() >= 16) {
                  new_id = new_id.substring(0, 15);
                  if (new_id.charAt(new_id.length() - 1) == '.') {
                        new_id = new_id.substring(0, 14);
                  }
            }

            // step 7
            if (new_id.length() <= 2) {
                  while (new_id.length() < 3) {
                        new_id += new_id.charAt(new_id.length() - 1);
                  }
            }

            System.out.println(new_id);
      }
}