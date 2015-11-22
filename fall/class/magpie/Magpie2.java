/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	public static void main(String[] args) {

		int n = 128;

		while (n > 0) {
	    int rightMost = n % 10;
			System.out.println(rightMost);
	    if (n % rightMost != 0 || rightMost == 0) {
	      System.out.println("false");
	    }

	    n /= 10;
	  }

	  System.out.println("true");
	}

	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("miles") >= 0
				|| statement.indexOf("teacher") >= 0
				|| statement.indexOf("Dr. Miles") >= 0) {
			response = "Sounds like a good teacher!";
		}
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("bird") >= 0) {
			response = "Tell me more about your pets";
		}
		else if (statement.indexOf("shirt") >= 0
				|| statement.indexOf("pants") >= 0
				|| statement.indexOf("clothing") >= 0) {
			response = "Nice clothing!  Where did you get it?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 8;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4) {
			response = "What's up?";
		}
		else if (whichResponse == 5) {
			response = "Please tell me more!";
		}
		else if (whichResponse == 6) {
			response = "Cool!";
		}
		else if (whichResponse == 7) {
			response = "Interesting...";
		}

		return response;
	}
}
