import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Ex1 {
      public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<String, Integer>();

            // put(key, value) : Add an element to map
            map.put("Hong", 85);
            map.put("Dong", 90);
            map.put("Kang", 79);
            map.put("Hong", 91);

            // size() : Return the size of map
            System.out.println("Total number of entry : " + map.size());

            // get(key) : Find element using key
            System.out.println("\tHong : " + map.get("Hong"));
            System.out.println();

            Set<String> keySet = map.keySet();
            Iterator<String> keyIterator = keySet.iterator();

            while (keyIterator.hasNext()) {
                  String key = keyIterator.next();
                  Integer value = map.get(key);
                  System.out.println("\t" + key + " : " + value);
            }

            System.out.println();

            map.remove("Hong");
            System.out.println("Total number of entry : " + map.size());

            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

            while (entryIterator.hasNext()) {
                  // Full-Searching and printing
                  Map.Entry<String, Integer> entry = entryIterator.next();
                  String key = entry.getKey();
                  Integer value = entry.getValue();
                  System.out.println("\t" + key + " : " + value);
            }
            System.out.println();

            map.clear();
            System.out.println("Total number of entry : " + map.size());
      }
}
