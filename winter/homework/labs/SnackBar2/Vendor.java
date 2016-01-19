/**
 * Coins
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 *
 * @author  Rudd Fawcett
 * @course  Period 6 AP CS, Ms. Litvin
 * @due     2016-01-15
 */

public class Vendor {
  /**
   * The number of items in stock.
   */
  private int stock;
  /**
   * The unit price per item in stock.
   */
  private int price;
  /**
   * The amount of cents inserted into the machine.
   */
  private int deposit;
  /**
   * The amount of change to give back to the user.
   */
  private int change;


  private static double totalSales = 0;

  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor(int price, int stock) {
    this.price = price;
    this.stock = stock;
  }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int stock){
    this.stock = stock;
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock() {
    return stock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int cents) {
    deposit += cents;
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit() {
    return deposit;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale() {
    if (stock > 0 && deposit >= price) {
      // price / 100 converts cents to dollars.
      totalSales += price / 100.0;
      stock--;
      change = deposit - price;
      deposit = 0;
      return true;
    }

    change = deposit;
    deposit = 0;
    return false;
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change
   */
  public int getChange() {
    int tmp = change;
    change = 0;
    return tmp;
  }

  /**
   * The total amount of money spent at the machine.
   * @return The amount in dollars and cents.
   */
  public static double getTotalSales() {
    double tmp = totalSales;
    totalSales = 0;
    return tmp;
  }
}
