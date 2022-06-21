import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable_Ex1 {
      public static void main(String[] args) {
            Map<String, String> map = new Hashtable<String, String>();

            map.put("spring", "12");
            map.put("summer", "123");
            map.put("fall", "1234");
            map.put("winter", "12345");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                  System.out.println("Enter the ID and password.");
                  System.out.print("ID : ");
                  String id = scanner.nextLine();
                  System.out.print("password : ");
                  String password = scanner.nextLine();
                  System.out.println();

                  if (map.containsKey(id)) {
                        if (map.get(id).equals(password)) {
                              System.out.println("Log in comleted");
                              break;
                        } else {
                              System.out.println("Wrong password");
                        }
                  } else {
                        System.out.println("ID is not exist");
                  }
            }
            scanner.close();
      }
}
