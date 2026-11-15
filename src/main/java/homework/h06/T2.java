package homework.h06;

// https://leetcode.com/problems/valid-palindrome/
public class T2 {

  public boolean isPalindrome(String text) {
    int left = 0;
    int right = text.length() - 1;

    while (left < right) {
      while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
        left++;
      }
      while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
        right--;
      }

      if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
        return false;
      }

      left++;
      right--;
    }

    return true;
  }
}
