import java.util.ArrayList;

public class Quiz {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("oneasdfsadf");
    list.add("asdf");
    list.add("asdf");
    list.add("fish");
    list.add("redasdf");
    list.add("fish");

    int i = list.indexOf("fish");
    // list.remove(i);
    // list.remove(i+1);

    System.out.println(extracted(list));
  }

  public static ArrayList<String> extracted(ArrayList<String> list) {
    ArrayList<String> extracted = new ArrayList<String>();

    for (int k = 0; k < list.size(); k++) {
      if (list.get(k).length() <= 5) {
        extracted.add(list.remove(k));
      }
    }

    return extracted;
  }
}
