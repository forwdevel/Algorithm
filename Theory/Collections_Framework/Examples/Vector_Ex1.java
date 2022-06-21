import java.util.*;

public class Vector_Ex1 {
      public static void main(String[] args) {
            List<Board> list = new Vector<Board>();
            list.add(new Board("Subject_1", "Content_1"));
            list.add(new Board("Subject_2", "Content_2"));
            list.add(new Board("Subject_3", "Content_3"));
            list.add(new Board("Subject_4", "Content_4"));
            list.add(new Board("Subject_5", "Content_5"));

            list.remove(2);
            list.remove(3);

            for (int i = 0; i < list.size(); i++) {
                  Board board = list.get(i);
                  System.out.println(board.subject + "\t" + board.content);
            }
      }
}

class Board {
      String subject;
      String content;

      Board(String subject, String content) {
            this.subject = subject;
            this.content = content;
      }
}