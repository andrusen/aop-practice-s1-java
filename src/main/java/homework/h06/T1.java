package homework.h06;

// https://leetcode.com/problems/valid-anagram/
public class T1 {

  private static final int ALPHABET_SIZE = 26;

  public boolean isAnagram(String source, String target) {
    if (source.length() != target.length()) {
      return false;
    }

    int[] charCounts = new int[ALPHABET_SIZE];
    for (int i = 0; i < source.length(); i++) {
      charCounts[source.charAt(i) - 'a']++;
      charCounts[target.charAt(i) - 'a']--;
    }

    for (int count : charCounts) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }
}
