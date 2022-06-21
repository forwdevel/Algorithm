import java.util.Iterator;
import java.util.TreeSet;

public class Comparable_Ex1 {
      public static void main(String[] args) {
            TreeSet<Person> treeSet = new TreeSet<Person>();

            treeSet.add(new Person("Hong", 45));
            treeSet.add(new Person("Kim", 25));
            treeSet.add(new Person("Park", 31));

            Iterator<Person> iterator = treeSet.iterator();
            while (iterator.hasNext()) {
                  Person person = iterator.next();
                  System.out.printf("%-4s : %2d\n", person.name, person.age);
            }
      }
}

class Person implements Comparable<Person> {
      public String name;
      public int age;

      public Person(String name, int age) {
            this.name = name;
            this.age = age;
      }

      public int compareTo(Person arg0) {
            if (age < arg0.age)
                  return -1;
            else if (age == arg0.age)
                  return 0;
            else
                  return 1;
      }
}