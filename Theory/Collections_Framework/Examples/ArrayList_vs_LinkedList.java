import java.util.*;;

public class ArrayList_vs_LinkedList {
      public static void main(String[] args) {
            List<String> arrList = new ArrayList<String>();
            List<String> linkList = new LinkedList<String>();

            long timeStart;
            long timeEnd;

            timeStart = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                  arrList.add(0, String.valueOf(i));
            }
            timeEnd = System.nanoTime();
            System.out.println("ArrayList Tasking Time : " + (timeEnd - timeStart) + "ns");

            timeStart = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                  linkList.add(0, String.valueOf(i));
            }
            timeEnd = System.nanoTime();
            System.out.println("LinkedList Tasking Time : " + (timeEnd - timeStart) + "ns");
      }
}
