import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Ex2 {
      public static void main(String[] args) {
            TreeSet<String> treeSet = new TreeSet<String>();

            treeSet.add("apple");
            treeSet.add("forever");
            treeSet.add("description");
            treeSet.add("ever");
            treeSet.add("zoo");
            treeSet.add("base");
            treeSet.add("guess");
            treeSet.add("cherry");

            System.out.println("[Sentence searching between c to f]");
            // true => include 'c'
            // it include 'ca', although 'c' is false
            NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
            for (String word : rangeSet) {
                  System.out.println(word);
            }
      }
}
