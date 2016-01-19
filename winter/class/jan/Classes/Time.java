public class Time {
  private int hours;
  private int mins;

  public Time(int h, int m) {
    if (h > 23 || h < 0 || m > 60 || m < 0) {
      throw new IllegalArgumentException("Error: One of your parameters is negative, or greater than the acceptable value.");
    }

    this.hours = h;
    this.mins = m;
  }

  private int toMins() {
    return (hours * 60) + mins;
  }

  public boolean lessThan(Time t) {
    return toMins() < t.toMins();
  }

  public int elapsedSince(Time t) {
    // 1,440 = 24*60 (minutes in a day)
    return (t.toMins() + 24*60) - toMins();
  }

  public String toString() {
    return "Time: hours=" + hours + ", mins=" + mins;
  }
}
