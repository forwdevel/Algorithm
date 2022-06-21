import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Ex1 {
      public static void main(String[] args) {
            TreeMap<Integer, String> scores = new TreeMap<Integer, String>();

            scores.put(87, "Hong");
            scores.put(98, "Lee");
            scores.put(75, "Park");
            scores.put(95, "Shin");
            scores.put(80, "Kim");

            Map.Entry<Integer, String> entry = null;

            entry = scores.firstEntry();
            System.out.println("Lowest score : " + entry.getKey() + " - " + entry.getValue());

            entry = scores.lastEntry();
            System.out.println("Highest score : " + entry.getKey() + " - " + entry.getValue());

            entry = scores.lowerEntry(95);
            System.out.println("Scores under the 95 : " + entry.getKey() + " - " + entry.getValue());

            entry = scores.higherEntry(95);
            System.out.println("Scores above the 95 : " + entry.getKey() + " - " + entry.getValue());

            entry = scores.floorEntry(95);
            System.out.println("95 or most clearly under score : " + entry.getKey() + " - " + entry.getValue());

            entry = scores.floorEntry(85);
            System.out.println("85 or most clearly above score : " + entry.getKey() + " - " + entry.getValue());

            while (!scores.isEmpty()) {
                  entry = scores.pollFirstEntry();
                  System.out.println(entry.getKey() + " - " + entry.getValue() + "( The number of remain object : "
                              + scores.size() + ")");
            }
      }

}
