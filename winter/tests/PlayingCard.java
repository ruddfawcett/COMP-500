public class PlayingCard {
  private String suit;
  private int rank;

  public PlayingCard(String suit, int rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public PlayingCard() {
    this("spades", 1);
  }

  public boolean beats(PlayingCard other) {
    if (suit.equals(other.suit)) {
      return rank > other.rank;
    }

    return false;
  }

  public String toString() {
    return "PlayingCard: suit=" + suit + ", rank=" + rank;
  }

  public static void main(String[] args) {
    PlayingCard ace = new PlayingCard("clubs", 12);
    PlayingCard jack = new PlayingCard("clubs", 10);

    if (ace.beats(jack)) {
      System.out.println(ace);
    }
  }
}
