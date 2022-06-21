import java.util.*;

public class ArrayList_Ex2 {
      public static void main(String[] args) {
            // asList() => Create a ArrayList has fixed size
            List<String> list1 = Arrays.asList("서울시", "중부", "기술", "교육원");

            // Print all element of list1
            for (String name : list1) {
                  System.out.print(name + " ");
            }
            System.out.println();

            List<Integer> list2 = Arrays.asList(4, 3, 8, 1, 9, 12);
            for (int i = 0; i < list2.size(); i++) {
                  if (i == 3) {
                        System.out.print("- ");
                  }
                  System.out.print(list2.get(i) + " ");
            }
            System.out.println();
      }
}