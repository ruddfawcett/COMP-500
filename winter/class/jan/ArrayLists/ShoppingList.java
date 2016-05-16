import java.util.ArrayList;

public class ShoppingList extends ArrayList<String> {
  public void reverse() {
    for (int i = 0, k = size() - 1; i < k; i++) {
        add(i, remove(k));
    }
  }

  public void sort() {
    for (int i = 0; i < size() - 1; i++) {
      if (get(i).compareTo(get(i+1)) > 0) {
        String tmp = get(i);
        set(i, get(i+1));
        set(i+1, tmp);
      }
    }
  }

  public static void main(String[] args) {
    ShoppingList list = new ShoppingList();
    list.add("apple");
    list.add("banana");
    list.add("orange");
    list.add("pear");
    list.add("dragonfruit");
    list.add("banana");
    list.add("banana");
    list.add("banana");
    list.add("banana");
    list.add("banana");
    list.add("banana");
    list.add("kiwi");

    do {
      list.remove("banana");
    }
    while (list.contains("banana"));

    // while (list.contains("banana")) {
    //   list.remove("banana");
    // }

    // for (int k = list.size() - 1; k >= 0; k--) {
    //   System.out.println(list.get(k));
    // }

    // for

    // list.reverse();
    // list.sort();

    System.out.println(list);
  }
}
