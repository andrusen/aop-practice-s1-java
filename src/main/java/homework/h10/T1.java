package homework.h10;

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
public class T1 {

  private static final int ALPHABET_SIZE = 26;

  public char kthCharacter(int position) {
    int shifts = Integer.bitCount(position - 1);
    return (char) ('a' + shifts % ALPHABET_SIZE);
  }
}
