/**
 * IndexEntry
 * An entry stores a word and the line number it's on.
 *
 * @author  Rudd Fawcett & Rohan Lewis
 * @course  Period 6 AP CS, Ms. Litvin
 * @due     2015-02-01
 */

import java.util.ArrayList;

public class IndexEntry {
  /**
   * The word associated with the entry.
   */
  private String word;
  /**
   * The line number associated with the entry.
   */
  private ArrayList<Integer> numsList;

  public IndexEntry(String word) {
    this.word = word.toUpperCase();
    this.numsList = new ArrayList<Integer>();
  }

  /**
   * Adds a line number to the list of line numbers in the entry.
   */
  public void add(int num) {
    if (!numsList.contains(num)) {
      numsList.add(num);
    }
  }

  /**
   * Returns the entry's word.
   */
  public String getWord() {
    return word;
  }

  /**
   * Returns a word followed by its line numbers.
   */
  public String toString() {
    String nums = numsList.toString();
    nums = nums.substring(1, nums.length()-1);

    return word + " " + nums;
  }
}
