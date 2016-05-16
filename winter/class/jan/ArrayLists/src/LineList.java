import java.util.ArrayList;
import java.util.Collections;

public class LineList {
  private ArrayList<String> list;

  public LineList() {
    this.list = new ArrayList<String>();
  }

  public int size() {
    return list.size();
  }

  public String get(int k) {
    return list.get(k);
  }

  public void add(String line) {
    list.add(line);
  }

  public String remove(int k) {
    return list.remove(k);
  }

  public void move(int index, int newIndex) {
    list.add(newIndex, list.get(index));
    list.remove(index);
  }

  private void swap(int first, int second) {
    String first = list.get(first);

    

    list.add(first, remove(second));
    list.add(second, )
  }

  public void shuffle() {
    int n = list.size() - 1;


  }
}
