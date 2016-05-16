import java.util.ArrayList;

public class Homework {
  public static void removeConsectuiveDuplicates(ArrayList<String> lst) {
    for (int i = lst.size()-1; i >= 1; i--) {
      if (lst.get(i-1).equals(lst.get(i))) {
        lst.remove(lst.get(i));
      }
    }
  }

  public static void filter(ArrayList<Object> list1, ArrayList<Object> list2) {
    for (Object a : list2) {
      int i = 0;
      while (i < list1.size()) {
        if (list1.get(i) == a) {
          list1.remove(i);
        }
        else {
          i++;
        }
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Object> list1 = new ArrayList<Object>();
    list1.add("apple");
    list1.add("apple");
    list1.add("apple");
    list1.add("apple");

    // removeConsectuiveDuplicates(list1);
    System.out.println(list1);

    ArrayList<Object> list2 = new ArrayList<Object>();
    list2.add("apple");
    list2.add("banana");

    filter(list1, list2);

    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);
  }
}
