import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// For Leet submit template

class Main {
      public static void main(String[] args) {
            String s = "welcometojava";
            int k = 3;

            TreeSet<String> temp = new TreeSet<String>();

            while (s.length() > k) {
                  temp.add(s.substring(0, k));
                  s = s.substring(k, s.length());
            }

            temp.add(s);

            List<String> tempArr = new ArrayList<String>();
            tempArr.addAll(temp);

            s = "";

            String smallest = tempArr.get(0);
            String largest = tempArr.get(tempArr.size() - 1);

            System.out.println(smallest + " " + largest);

      }
}