/**
 * DocumentIndex
 * An array of IndexEntrys.
 *
 * @author  Rudd Fawcett & Rohan Lewis
 * @course  Period 6 AP CS, Ms. Litvin
 * @due     2015-02-01
 */

import java.util.ArrayList;
import java.util.Arrays;

public class DocumentIndex extends ArrayList<IndexEntry> {
  public DocumentIndex() {
    super();
  }

  public DocumentIndex(int capacity) {
    super(capacity);
  }

  /**
   * Adds a line number to an entry in the index.
   */
  public void addWord(String word, int num) {
    int idx = foundOrInserted(word);

    IndexEntry entry = get(idx);
    entry.add(num);
  }

  /**
   * Adds all of the words in a line of text as entries.
   */
  public void addAllWords(String str, int num) {
    String[] words = str.split("\\W+");
    for (String word : words) {
      if (word.length() != 0) {
        addWord(word, num);
      }
    }
  }

  /**
   * Places a word alphabetically into the document index, and returns its index.
   * If the word already exists, it just returns the index of that entry.
   */
  private int foundOrInserted(String word) {
    if (size() == 0) {
      add(new IndexEntry(word));
      return 0;
    }

    for (int idx = 0; idx < size(); idx++) {
      if (get(idx).getWord().equalsIgnoreCase(word)) {
        return idx;
      }

      if (get(idx).getWord().compareToIgnoreCase(word) > 0) {
        add(idx, new IndexEntry(word));
        return idx;
      }

      if (idx == size() - 1) {
        add(new IndexEntry(word));
        return idx + 1;
      }
    }

    return 0;
  }
}
