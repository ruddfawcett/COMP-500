/**
 * Rudd Fawcett & Alex Emerson
 * Uses the PollDisplayPanel to keep track of votes for different people.
 *
 * @author  Rudd Fawcett
 * @course  Period 1 AP CS, Dr. Miles
 * @due     2015-10-02
 */

import java.util.Scanner;

public class PollTest {
  private static PollDisplayPanel votingMachine;

  public static void main (String[] args) {
    votingMachine = new PollDisplayPanel("Tami", "Brian", "Liz");

    initialVotes();

    System.out.println("Current standings:");
    System.out.println(votingMachine);
    System.out.print("Please vote for someone: ");

    Scanner keyboard = new Scanner(System.in);
    String name = keyboard.nextLine().trim();

    checkName(name);
  }

  public static void initialVotes() {
    votingMachine.vote1();
    votingMachine.vote1();
    votingMachine.vote1();
    votingMachine.vote1();

    votingMachine.vote2();
    votingMachine.vote2();

    votingMachine.vote3();
    votingMachine.vote3();
    votingMachine.vote3();
  }

  public static void checkName(String name) {
    if (name.equals("Tami")) {
      votingMachine.vote1();
    }
    else if (name.equals("Brian")) {
      votingMachine.vote2();
    }
    else if (name.equals("Liz")) {
      votingMachine.vote3();
    }
    else {
      System.out.println("You entered an invalid name!");
      return;
    }

    System.out.println("You voted for " + name + ", here are the new results!");
    System.out.println(votingMachine);
  }
}
