
// For Algorithm submit template
import java.util.*;

class Main {
      public static String[] solution(String[] strings, int n) {
            List<String> temp = new ArrayList<String>();
            List<String> ele = new ArrayList<String>();

            for (int i = 0; i < strings.length; i++) {
                  temp.add(strings[i]);
            }

            temp.sort(new compareOne(n));

            int start = 0;
            while (true) {
                  start++;
                  if (start == temp.size()) {
                        break;
                  }
                  try {
                        if (ele.isEmpty()) {
                              if (temp.get(start - 1).charAt(n) == temp.get(start).charAt(n)) {
                                    ele.add(temp.get(start - 1));
                                    temp.remove(start - 1);
                                    ele.add(temp.get(start));
                                    temp.remove(start--);
                                    continue;
                              }
                        } else if (!ele.isEmpty()) {
                              if (ele.get(ele.size() - 1).charAt(n) == temp.get(start - 1).charAt(n)) {
                                    ele.add(temp.get(start));
                                    temp.remove(start--);
                                    continue;
                              }
                        }
                  } catch (IndexOutOfBoundsException e) {
                        continue;
                  }

                  ele.sort(new compareStr());
                  for (int i = 0; i < ele.size(); i++) {
                        temp.add(i + start, ele.get(i));
                  }
                  ele.clear();
            }

            String[] answer = new String[temp.size()];

            for (int i = 0; i < temp.size(); i++) {
                  answer[i] = temp.get(i);
            }

            return answer;
      }

      public static void main(String[] args) {
            // first case
            // String[] str = { "sun", "bed", "car" };
            // int n = 1;

            // second case
            String[] str = { "abce", "abcd", "cdx" };
            int n = 2;

            str = solution(str, n);

            for (int i = 0; i < str.length; i++) {
                  System.out.print(str[i] + " ");
            }
      }
}

class compareOne implements Comparator<String> {
      int idx;

      compareOne(int idx) {
            this.idx = idx;
      }

      @Override
      public int compare(String o1, String o2) {
            return o1.charAt(idx) - o2.charAt(idx);
      }

}

class compareStr implements Comparator<String> {

      @Override
      public int compare(String o1, String o2) {
            return o1.compareTo(o2);
      }

}