public class Elby {
  /**
   * Get a default greeting
   *
   * @return a greeting
   */
  public String getGreeting() {
    return "Hello, let's talk.";
  }

  /**
   * Gives a response to a user statement
   *
   * @param statement the user statement
   * @return a response based on the rules given
   */
  public String getResponse(String statement) {
    String response = "";

    if (findKeyword(statement, "no", 0) >= 0) {
      response = "Why so negative?";

    } else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
      response = "Tell me more about your pets.";
    } else if (statement.indexOf("Booze") >= 0) {
      response = "The potato.";
    } else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
      response = "Tell me more about your family.";
    } else {
      response = getRandomResponse();
    }

    return response;
  }

  /**
   * Pick a default response to use if nothing else fits.
   *
   * @return a non-committal string
   */
  private String getRandomResponse() {
    final int NUMBER_OF_RESPONSES = 5;
    double r = Math.random();
    int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

    String response = "";

    if (whichResponse == 0) {
      response = "Interesting, tell me more.";
    } else if (whichResponse == 1) {
      response = "Hmmm.";
    } else if (whichResponse == 2) {
      response = "Do you really think so?";
    } else if (whichResponse == 3) {
      response = "You don't say.";
    } else if (whichResponse == 4) {
      response = "Tell me more.";
    }

    return response;
  }

  /**
   * Search for one word in phrase. The search is not case sensitive. This method will check that
   * the given goal is not a substring of a longer string (so, for example, "I know" does not
   * contain "no").
   *
   * @param statement the string to search
   * @param goal the string to search for
   * @param startPos the character of the string to begin the search at
   * @return the index of the first occurrence of goal in statement or -1 if it's not found
   */
  public int findKeyword(String statement, String goal, int startPos) {
    String phrase = statement.trim().toLowerCase();
    goal = goal.toLowerCase();

    // The only change to incorporate the startPos is in the line below
    int goalPos = phrase.indexOf(goal, startPos);

    // Refinement--make sure the goal isn't part of a word
    while (goalPos >= 0) {
      // Find the string of length 1 before and after the word
      String before = " ", after = " ";

      if (goalPos > 0) {
        before = phrase.substring(goalPos - 1, goalPos);
      }

      if (goalPos + goal.length() < phrase.length()) {
        after = phrase.substring(goalPos + goal.length(), goalPos + goal.length() + 1);
      }

      /* determine the values of goalPos, before, and after at this point */

      // If before and after aren't letters, we've found the word
      if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
          && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
        return goalPos;
      }

      // The last position didn't work, so let's find the next, if there is one.
      goalPos = phrase.indexOf(goal, goalPos + 1);
    }
    return -1;
  }
}
