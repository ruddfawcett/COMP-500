import java.util.ArrayList;

public class PIJ {
  public static void main(String[] args) {

    ArrayList<Integer> list2 = new ArrayList<Integer>();
    list2.add(72);
    list2.add(20);

    mystery3(list2);

    ArrayList<Integer> list3 = new ArrayList<Integer>();
    list3.add(1);
    list3.add(2);
    list3.add(3);
    list3.add(4);
    list3.add(5);
    list3.add(6);

    mystery3(list3);

      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);

      mystery3(list);
  }

  public static void mystery1(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i > 0; i--) {
        if (list.get(i) < list.get(i - 1)) {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element);
        }
    }
    System.out.println(list);
  }

  public static void mystery2(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
        if (i % 2 == 0) {
            list.add(list.get(i));
        } else {
            list.add(0, list.get(i));
        }
    }
    System.out.println(list);
}

public static void mystery4(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        int element = list.get(i);
        list.remove(i);
        list.add(0, element + 1);
    }
    System.out.println(list);
}
public static void mystery3(ArrayList<Integer> list) {
    for (int i = list.size() - 2; i > 0; i--) {
        int a = list.get(i);
        int b = list.get(i + 1);
        list.set(i, a + b);
    }
    System.out.println(list);
}
}
