/**
 * SortedWordList
 * This class constructs an SortedWordList, an ArrayList of Strings, and
 * provides methods for adding words and merging lists.
 *
 * Worked with: Ally Klionsky && Sabrina Lu
 *
 * @author  Rudd Fawcett && Nora NcNamara-Bordewick
 * @course  Period 3 AP CS, Ms. Litvin
 * @due     2016-03-28
 */

import java.util.ArrayList;

public class SortedWordList extends ArrayList<String> {
  /**
   * Constructs a SortedWordList with a default capacity.
   */
  public SortedWordList() {
    super();
  }

  /**
   * Constructs a SortedWordList with a given capacity.
   * @param capacity SortedWordList capacity (int).
   */
  public SortedWordList(int capacity) {
    super(capacity);
  }

  /**
   * Uses the indexOf method to determine if a SortedWordList
   * contains a given word.
   * @param word to check if the SortedWordList already contains.
   * @return boolean if the word was found.
   */
  public boolean contains(String word) {
    return indexOf(word) != -1;
  }

  /**
   * Uses binary search to find the index of a given word in the SortedWordList.
   * @param word to find the index of in the SortedWordList.
   * @return the index of the word or -1 if not found.
   */
  public int indexOf(String word) {
    int left = 0;
    int right = size();

    while (left < right) {
      int middle = (left + right) / 2;
      int diff = word.compareToIgnoreCase(get(middle));

      if (diff < 0) {
        right = middle;
      }
      else if (diff > 0) {
        left = middle + 1;
      }
      else {
        return middle;
      }
    }

    return -1;
  }

  /**
   * Overrides ArrayList's set method. Checks if the word isn't already at the index
   * before or after. Sets that index to the word.
   * @param word to set in the SortedWordList.
   * @param int i, index to add word at.
   * @return the index of the word or -1 if not found.
   */
  public String set(int i, String word) {
    boolean previous = (i > 0  && word.compareToIgnoreCase(get(i-1)) > 0);
    boolean next = (i < size()-1 && word.compareToIgnoreCase(get(i+1)) < 0);

    if ((i == 0 || previous) && (i == 0 || next)) {
      return super.set(i, word);
    }
    else {
      throw new IllegalArgumentException("word=" + word + " i=" + i);
    }
  }

  /**
   * Overrides ArrayList's add method. Adds a given word to a certain index in the SortedWordList.
   * @param int i, index to add word at.
   * @param word to add to SortedWordList.
   */
  public void add(int i, String word) {
    boolean previous = (i > 0 && word.compareToIgnoreCase(get(i-1)) <= 0);
    boolean next = (i < size() && word.compareToIgnoreCase(get(i)) >= 0);

    if (previous || next) {
      throw new IllegalArgumentException("word=" + word + " i=" + i);
    }

    super.add(i, word);
  }

  /**
   * Overrides SortedWordList's add method. Uses binary search to find where to add the word.
   * @param word to add to SortedWordList.
   * @return boolean if the word was added.
   */
  public boolean add(String word) {
    if (contains(word)) {
      return false;
    }

    int left = 0;
    int right = size();

    while (left < right) {
      int middle = (left + right) / 2;
      int diff = word.compareToIgnoreCase(get(middle));

      if (diff < 0) {
        right = middle;
      }
      else {
        left = middle + 1;
      }
    }

    add(right, word);

    return true;
  }

  /**
  * Merges the list "other" into this list. After this method executes,
  * this list will contain all the words it did originally, plus any new
  * words found in list "other", all in (case-insensitive) alphabetical
  * order.
  * The worst-case running time of this method is proportional to the
  * sum of other.size() + the size of this list prior to the call to
  * merge().
  * @param SortedWordList to merge.
  */
  public void merge(SortedWordList other) {
     SortedWordList temp = new SortedWordList(size() + other.size());

      int a = 0;
      int b = 0;

     while (a < size() && b < other.size()) {
       if (get(a).compareToIgnoreCase(other.get(b)) > 0) {
           temp.add(other.get(b));
           b++;
         }
       else if (get(a).compareToIgnoreCase(other.get(b)) < 0) {
           temp.add(get(a));
           a++;
         }
       else {
           temp.add(get(a));
           a++;
           b++;
         }
       }

     while (a < size()) {
       temp.add(get(a));
       a++;
     }

     while (b < other.size()) {
       temp.add(other.get(b));
       b++;
     }

     clear();
     addAll(temp);
   }
}
